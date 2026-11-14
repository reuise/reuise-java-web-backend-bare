package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.list.WebBackendListItemOptions;
public class MenuItem extends AbstractMenuItem<MenuItem, MenuItemOptions> {
    public MenuItem() {
        this(createOptions());
    }

    public MenuItem(MenuItemOptions options) {
        super(options);
    }

    public static MenuItemOptions createOptions() {
        return new MenuItemOptions();
    }

    public static MenuItem create(MenuItemOptions options) {
        return new MenuItem(options);
    }

    public static MenuItem create(WebBackendListItemOptions options) {
        return create(new MenuItemOptions(options));
    }

    public static MenuItem create() {
        return new MenuItem();
    }

    @Override
    protected MenuItem self() {
        return this;
    }
}
