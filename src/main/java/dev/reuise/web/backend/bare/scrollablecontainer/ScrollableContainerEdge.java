package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ScrollableContainerEdge extends AbstractScrollableContainerEdge<ScrollableContainerEdge, ScrollableContainerEdgeOptions> {
    public ScrollableContainerEdge() {
        this(createOptions());
    }

    public ScrollableContainerEdge(ScrollableContainerEdgeOptions options) {
        super(options);
    }

    public static ScrollableContainerEdgeOptions createOptions() {
        return new ScrollableContainerEdgeOptions();
    }

    public static ScrollableContainerEdge create(ScrollableContainerEdgeOptions options) {
        return new ScrollableContainerEdge(options);
    }

    public static ScrollableContainerEdge create(WebBackendParentComponentOptions options) {
        return create(new ScrollableContainerEdgeOptions(options));
    }

    public static ScrollableContainerEdge create() {
        return new ScrollableContainerEdge();
    }

    @Override
    protected ScrollableContainerEdge self() {
        return this;
    }
}
