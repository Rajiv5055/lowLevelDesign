package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.Bill;
import FlipkartRestaurentManagement.src.entity.Order;
import FlipkartRestaurentManagement.src.entity.OrderedDishes;
import FlipkartRestaurentManagement.src.inMemory.BillingInMemory;
import FlipkartRestaurentManagement.src.inMemory.OrderInMemory;

public class BillingServiceImpl implements BillingService {

    BillingInMemory billingInMemory= new BillingInMemory();

    OrderInMemory orderInMemory;

    public BillingServiceImpl(OrderInMemory orderInMemory){
        this.orderInMemory = orderInMemory;
    }
    @Override
    public Bill calculateBill(String billId, String orderId) {
        if(!orderInMemory.getOrderMap().containsKey(orderId)){
            throw new RuntimeException("Order does not exist");
        }

        Order order = orderInMemory.getOrderMap().get(orderId);
        Bill bill = new Bill();

        bill.setBillId(billId);
        bill.setOrderId(orderId);
        Double totalAmount = 0.0;

        for(OrderedDishes dishes : order.getOrderedDishesList()){
            totalAmount += dishes.getTotalPrice();
        }

        bill.setBasePrice(totalAmount);
        bill.setTaxPrice(0.18 * totalAmount);
        bill.setTotalPrice(bill.getBasePrice() + bill.getTaxPrice());

        return bill;
    }
}
