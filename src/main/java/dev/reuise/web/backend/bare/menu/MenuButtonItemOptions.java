package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
public class MenuButtonItemOptions extends AbstractMenuButtonItemOptions<MenuButtonItemOptions> {
    public MenuButtonItemOptions() {
    }

    public MenuButtonItemOptions(WebBackendButtonOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MenuButtonItemOptions self() {
        return this;
    }
}
