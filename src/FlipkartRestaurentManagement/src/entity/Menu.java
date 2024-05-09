package FlipkartRestaurentManagement.src.entity;

import java.util.HashMap;

public class Menu {
    private String menuId;

    public HashMap<String, Dishes> getDishesHashMap() {
        return dishesHashMap;
    }

    public void setDishesHashMap(HashMap<String, Dishes> dishesHashMap) {
        this.dishesHashMap = dishesHashMap;
    }

    //    List<Dishes> menuList;
    HashMap<String, Dishes> dishesHashMap;
    public Menu(String Id){
        this.dishesHashMap = new HashMap<>();
        this.menuId = Id;
    }
}
