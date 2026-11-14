package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SlideContainerOptions extends AbstractSlideContainerOptions<SlideContainerOptions> {
    public SlideContainerOptions() {
    }

    public SlideContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SlideContainerOptions self() {
        return this;
    }
}
