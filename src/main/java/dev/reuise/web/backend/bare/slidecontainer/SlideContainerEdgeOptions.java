package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class SlideContainerEdgeOptions extends AbstractSlideContainerEdgeOptions<SlideContainerEdgeOptions> {
    public SlideContainerEdgeOptions() {
    }

    public SlideContainerEdgeOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SlideContainerEdgeOptions self() {
        return this;
    }
}
