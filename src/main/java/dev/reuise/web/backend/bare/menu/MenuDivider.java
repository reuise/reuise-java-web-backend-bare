package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.menu.WebBackendMenuItemOptions;
public class MenuDivider extends AbstractMenuDivider<MenuDivider, MenuDividerOptions> {
    public MenuDivider() {
        this(createOptions());
    }

    public MenuDivider(MenuDividerOptions options) {
        super(options);
    }

    public static MenuDividerOptions createOptions() {
        return new MenuDividerOptions();
    }

    public static MenuDivider create(MenuDividerOptions options) {
        return new MenuDivider(options);
    }

    public static MenuDivider create(WebBackendMenuItemOptions options) {
        return create(new MenuDividerOptions(options));
    }

    public static MenuDivider create() {
        return new MenuDivider();
    }

    @Override
    protected MenuDivider self() {
        return this;
    }
}
