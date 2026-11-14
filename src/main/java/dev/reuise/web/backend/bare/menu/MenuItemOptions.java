package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.list.WebBackendListItemOptions;
public class MenuItemOptions extends AbstractMenuItemOptions<MenuItemOptions> {
    public MenuItemOptions() {
    }

    public MenuItemOptions(WebBackendListItemOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MenuItemOptions self() {
        return this;
    }
}
