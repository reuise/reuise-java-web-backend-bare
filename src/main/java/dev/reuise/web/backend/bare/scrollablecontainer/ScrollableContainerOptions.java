package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class ScrollableContainerOptions extends AbstractScrollableContainerOptions<ScrollableContainerOptions> {
    public ScrollableContainerOptions() {
    }

    public ScrollableContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ScrollableContainerOptions self() {
        return this;
    }
}
