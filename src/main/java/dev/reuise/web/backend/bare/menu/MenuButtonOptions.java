package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class MenuButtonOptions extends AbstractMenuButtonOptions<MenuButtonOptions> {
    public MenuButtonOptions() {
    }

    public MenuButtonOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MenuButtonOptions self() {
        return this;
    }
}
