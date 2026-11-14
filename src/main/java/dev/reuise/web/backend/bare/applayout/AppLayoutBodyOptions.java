package dev.reuise.web.backend.bare.applayout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class AppLayoutBodyOptions extends AbstractAppLayoutBodyOptions<AppLayoutBodyOptions> {
    public AppLayoutBodyOptions() {
    }

    public AppLayoutBodyOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected AppLayoutBodyOptions self() {
        return this;
    }
}
