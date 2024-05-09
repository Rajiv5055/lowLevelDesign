package FlipkartRestaurentManagement.src.inMemory;

import FlipkartRestaurentManagement.src.entity.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderInMemory {
    public Map<String, Order> getOrderMap() {
        return orderMap;
    }

    private final Map<String, Order> orderMap = new HashMap<>();
 }
