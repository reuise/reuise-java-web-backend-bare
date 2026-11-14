package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class ViewOptions extends AbstractViewOptions<ViewOptions> {
    public ViewOptions() {
    }

    public ViewOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ViewOptions self() {
        return this;
    }
}
