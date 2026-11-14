package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.menu.WebBackendMenuItemOptions;
public class MenuDividerOptions extends AbstractMenuDividerOptions<MenuDividerOptions> {
    public MenuDividerOptions() {
    }

    public MenuDividerOptions(WebBackendMenuItemOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MenuDividerOptions self() {
        return this;
    }
}
