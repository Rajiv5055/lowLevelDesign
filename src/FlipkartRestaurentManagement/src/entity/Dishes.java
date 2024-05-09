package FlipkartRestaurentManagement.src.entity;

import com.example.FlipkartRestaurentManagement.enums.DishCategory;

public class Dishes {
    private String dishId;
    private String dishName;
    private String description;
//    private CousineType cousineType;
    private Double price;
    private com.example.FlipkartRestaurentManagement.enums.DishCategory category;

    public Dishes() {
    }

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public DishCategory getCategory() {
        return category;
    }

    public void setCategory(DishCategory category) {
        this.category = category;
    }
}
