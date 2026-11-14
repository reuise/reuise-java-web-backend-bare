package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
public class MenuButtonItem extends AbstractMenuButtonItem<MenuButtonItem, MenuButtonItemOptions> {
    public MenuButtonItem() {
        this(createOptions());
    }

    public MenuButtonItem(MenuButtonItemOptions options) {
        super(options);
    }

    public static MenuButtonItemOptions createOptions() {
        return new MenuButtonItemOptions();
    }

    public static MenuButtonItem create(MenuButtonItemOptions options) {
        return new MenuButtonItem(options);
    }

    public static MenuButtonItem create(WebBackendButtonOptions options) {
        return create(new MenuButtonItemOptions(options));
    }

    public static MenuButtonItem create() {
        return new MenuButtonItem();
    }

    @Override
    protected MenuButtonItem self() {
        return this;
    }
}
