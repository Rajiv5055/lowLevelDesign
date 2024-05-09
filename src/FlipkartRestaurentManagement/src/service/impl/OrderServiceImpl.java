package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.Bill;
import FlipkartRestaurentManagement.src.entity.Order;
import FlipkartRestaurentManagement.src.entity.OrderedDishes;
import FlipkartRestaurentManagement.src.inMemory.OrderInMemory;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    public static long count = 1;

    OrderInMemory orderInMemory = new OrderInMemory();
    @Override
    public void createOrder(String orderId, List<OrderedDishes> orderedDishesList, String userId) {
        Order newOrder = new Order();
        newOrder.setOrderId(orderId);

        for(OrderedDishes current : orderedDishesList){
            current.setTotalPrice(current.getPrice()*current.getQuantity());
        }

        newOrder.setOrderedDishesList(orderedDishesList);
        newOrder.setUserId(userId);

        orderInMemory.getOrderMap().put(orderId, newOrder);

        System.out.println("Order created successful for user : " + userId);
    }

    @Override
    public void updateOrder(String orderId, List<OrderedDishes> udpatedDishes, String userId) {
        if(!orderInMemory.getOrderMap().containsKey(orderId)){
            throw new RuntimeException("Order does not exist");
        }
        Order existingOrder = orderInMemory.getOrderMap().get(orderId);

        if(!existingOrder.getUserId().equals(userId)){
            throw new RuntimeException("User cannot update this order");
        }
        existingOrder.setOrderedDishesList(udpatedDishes);

        orderInMemory.getOrderMap().put(orderId, existingOrder);

        System.out.println("Order updated successful for user : " + userId);
    }

    @Override
    public void getOrder(String orderId) {

        if(!orderInMemory.getOrderMap().containsKey(orderId)){
            throw new RuntimeException("Order does not exist");
        }

        Order order = orderInMemory.getOrderMap().get(orderId);

        System.out.println(order.getOrderId() + " : " );
        for(OrderedDishes el : order.getOrderedDishesList()){
            System.out.println(el.getDishId() + " " + el.getQuantity());
        }
    }

    @Override
    public void placeOrder(String orderId) {
        if(!orderInMemory.getOrderMap().containsKey(orderId)){
            throw new RuntimeException("Order does not exist");
        }
        Order order = orderInMemory.getOrderMap().get(orderId);
        order.setOrderPlaced(Boolean.TRUE);

        BillingService billingService = new BillingServiceImpl(orderInMemory);

        Bill createBill = billingService.calculateBill(orderId, String.valueOf(count));
        count++;

        System.out.println(createBill);
    }
}
