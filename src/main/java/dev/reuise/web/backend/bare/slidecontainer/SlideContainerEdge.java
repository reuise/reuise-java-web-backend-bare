package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class SlideContainerEdge extends AbstractSlideContainerEdge<SlideContainerEdge, SlideContainerEdgeOptions> {
    public SlideContainerEdge() {
        this(createOptions());
    }

    public SlideContainerEdge(SlideContainerEdgeOptions options) {
        super(options);
    }

    public static SlideContainerEdgeOptions createOptions() {
        return new SlideContainerEdgeOptions();
    }

    public static SlideContainerEdge create(SlideContainerEdgeOptions options) {
        return new SlideContainerEdge(options);
    }

    public static SlideContainerEdge create(WebBackendParentComponentOptions options) {
        return create(new SlideContainerEdgeOptions(options));
    }

    public static SlideContainerEdge create() {
        return new SlideContainerEdge();
    }

    @Override
    protected SlideContainerEdge self() {
        return this;
    }
}
