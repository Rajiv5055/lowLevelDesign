package FlipkartRestaurentManagement.src.service.impl;


import FlipkartRestaurentManagement.src.entity.Dishes;

import java.util.List;

public interface MenuService {
    public void addDish(Dishes d);
    public void updateDish(String dishId, Double price);

    public void removeDish(String dishId);

    public void getMenu();

}
