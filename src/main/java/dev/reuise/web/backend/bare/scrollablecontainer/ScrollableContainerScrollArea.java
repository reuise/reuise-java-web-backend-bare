package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ScrollableContainerScrollArea extends AbstractScrollableContainerScrollArea<ScrollableContainerScrollArea, ScrollableContainerScrollAreaOptions> {
    public ScrollableContainerScrollArea() {
        this(createOptions());
    }

    public ScrollableContainerScrollArea(ScrollableContainerScrollAreaOptions options) {
        super(options);
    }

    public static ScrollableContainerScrollAreaOptions createOptions() {
        return new ScrollableContainerScrollAreaOptions();
    }

    public static ScrollableContainerScrollArea create(ScrollableContainerScrollAreaOptions options) {
        return new ScrollableContainerScrollArea(options);
    }

    public static ScrollableContainerScrollArea create(WebBackendParentComponentOptions options) {
        return create(new ScrollableContainerScrollAreaOptions(options));
    }

    public static ScrollableContainerScrollArea create() {
        return new ScrollableContainerScrollArea();
    }

    @Override
    protected ScrollableContainerScrollArea self() {
        return this;
    }
}
