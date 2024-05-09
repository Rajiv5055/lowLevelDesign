package FlipkartRestaurentManagement.src.inMemory;

import FlipkartRestaurentManagement.src.entity.Bill;

import java.util.HashMap;
import java.util.Map;

public class BillingInMemory {
    private final Map<String, Bill> billMap = new HashMap<>();
}
