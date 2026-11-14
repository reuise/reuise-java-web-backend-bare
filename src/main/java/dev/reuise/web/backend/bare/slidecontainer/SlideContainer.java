package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SlideContainer extends AbstractSlideContainer<SlideContainer, SlideContainerOptions> {
    public SlideContainer() {
        this(createOptions());
    }

    public SlideContainer(SlideContainerOptions options) {
        super(options);
    }

    public static SlideContainerOptions createOptions() {
        return new SlideContainerOptions();
    }

    public static SlideContainer create(SlideContainerOptions options) {
        return new SlideContainer(options);
    }

    public static SlideContainer create(WebBackendContainerOptions options) {
        return create(new SlideContainerOptions(options));
    }

    public static SlideContainer create() {
        return new SlideContainer();
    }

    @Override
    protected SlideContainer self() {
        return this;
    }
}
