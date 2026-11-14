package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ScrollableContainerEdgeOptions extends AbstractScrollableContainerEdgeOptions<ScrollableContainerEdgeOptions> {
    public ScrollableContainerEdgeOptions() {
    }

    public ScrollableContainerEdgeOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ScrollableContainerEdgeOptions self() {
        return this;
    }
}
