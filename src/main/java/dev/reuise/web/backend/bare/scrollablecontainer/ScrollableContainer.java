package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class ScrollableContainer extends AbstractScrollableContainer<ScrollableContainer, ScrollableContainerOptions> {
    public ScrollableContainer() {
        this(createOptions());
    }

    public ScrollableContainer(ScrollableContainerOptions options) {
        super(options);
    }

    public static ScrollableContainerOptions createOptions() {
        return new ScrollableContainerOptions();
    }

    public static ScrollableContainer create(ScrollableContainerOptions options) {
        return new ScrollableContainer(options);
    }

    public static ScrollableContainer create(WebBackendContainerOptions options) {
        return create(new ScrollableContainerOptions(options));
    }

    public static ScrollableContainer create() {
        return new ScrollableContainer();
    }

    @Override
    protected ScrollableContainer self() {
        return this;
    }
}
