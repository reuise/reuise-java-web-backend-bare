package dev.reuise.web.backend.bare.applayout;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class AppLayoutOptions extends AbstractAppLayoutOptions<AppLayoutOptions> {
    public AppLayoutOptions() {
    }

    public AppLayoutOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected AppLayoutOptions self() {
        return this;
    }
}
