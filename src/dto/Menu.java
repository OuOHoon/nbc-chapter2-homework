package dto;

public class Menu {
    private String name;
    private String description;
    private MenuType menuType;


    public Menu(String name, String description, MenuType menuType) {
        this.name = name;
        this.description = description;
        this.menuType = menuType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MenuType getMenuType() {
        return menuType;
    }
}
