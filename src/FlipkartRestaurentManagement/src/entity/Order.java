package FlipkartRestaurentManagement.src.entity;

import java.util.List;

public class Order {
    private String orderId;
    private String userId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<OrderedDishes> getOrderedDishesList() {
        return orderedDishesList;
    }

    public void setOrderedDishesList(List<OrderedDishes> orderedDishesList) {
        this.orderedDishesList = orderedDishesList;
    }

    public Boolean getOrderPlaced() {
        return isOrderPlaced;
    }

    public void setOrderPlaced(Boolean orderPlaced) {
        isOrderPlaced = orderPlaced;
    }

    List<FlipkartRestaurentManagement.src.entity.OrderedDishes> orderedDishesList;
    private Boolean isOrderPlaced = false;
}
