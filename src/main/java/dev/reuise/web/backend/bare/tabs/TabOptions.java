package dev.reuise.web.backend.bare.tabs;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TabOptions extends AbstractTabOptions<TabOptions> {
    public TabOptions() {
    }

    public TabOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TabOptions self() {
        return this;
    }
}
