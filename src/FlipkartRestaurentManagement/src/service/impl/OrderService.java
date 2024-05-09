package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.OrderedDishes;

import java.util.List;

public interface OrderService {
    public void createOrder(String orderId, List<OrderedDishes> orderedDishesList, String userId);

    public void updateOrder(String orderId, List<OrderedDishes> udpatedDishes, String userId);

    public void getOrder(String orderId);

    public void placeOrder(String orderId);
}
