package dev.reuise.web.backend.bare.drawer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class DrawerOptions extends AbstractDrawerOptions<DrawerOptions> {
    public DrawerOptions() {
    }

    public DrawerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected DrawerOptions self() {
        return this;
    }
}
