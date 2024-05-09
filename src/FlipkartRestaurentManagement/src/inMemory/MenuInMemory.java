package FlipkartRestaurentManagement.src.inMemory;

import FlipkartRestaurentManagement.src.entity.Menu;

public class MenuInMemory {
    public Menu getMenu() {
        return menu;
    }

    private final Menu menu = new Menu("1");
//    private final Map<String, Menu> menuMap = new HashMap<>();
}
