package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.Bill;
public interface BillingService {
    public Bill calculateBill(String billId, String orderId);
}
