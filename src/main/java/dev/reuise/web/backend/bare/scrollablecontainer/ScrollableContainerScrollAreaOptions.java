package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ScrollableContainerScrollAreaOptions extends AbstractScrollableContainerScrollAreaOptions<ScrollableContainerScrollAreaOptions> {
    public ScrollableContainerScrollAreaOptions() {
    }

    public ScrollableContainerScrollAreaOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ScrollableContainerScrollAreaOptions self() {
        return this;
    }
}
