package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.Dishes;
import FlipkartRestaurentManagement.src.inMemory.MenuInMemory;

import java.util.Map;

public class MenuServiceImpl implements MenuService {

    MenuInMemory menuInMemory = new MenuInMemory();

    @Override
    public void addDish(Dishes d) {
        if(menuInMemory.getMenu().getDishesHashMap().containsKey(d.getDishId())){
            throw new RuntimeException("This dish already added to menu");
        }

        menuInMemory.getMenu().getDishesHashMap().put(d.getDishId(), d);
        System.out.println("Dish added successfully");
    }

    @Override
    public void updateDish(String dishId, Double price) {
        if(!menuInMemory.getMenu().getDishesHashMap().containsKey(dishId)){
            throw new RuntimeException("This dish does not exist");
        }

        menuInMemory.getMenu().getDishesHashMap().get(dishId).setPrice(price);
        System.out.println("Dish udpated successfully");
    }

    @Override
    public void removeDish(String dishId) {
        if(!menuInMemory.getMenu().getDishesHashMap().containsKey(dishId)){
            throw new RuntimeException("This dish does not exist");
        }

        menuInMemory.getMenu().getDishesHashMap().remove(dishId);
        System.out.println("Dish removed successfully");
    }

    @Override
    public void getMenu() {
        for(Map.Entry<String, Dishes> item : menuInMemory.getMenu().getDishesHashMap().entrySet()){
            System.out.println(item.getValue().getDishId() + " " + item.getValue().getPrice() + " : " + item.getValue());
        }
    }


}
