package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class MenuOptions extends AbstractMenuOptions<MenuOptions> {
    public MenuOptions() {
    }

    public MenuOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MenuOptions self() {
        return this;
    }
}
