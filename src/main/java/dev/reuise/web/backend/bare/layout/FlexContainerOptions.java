package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class FlexContainerOptions extends AbstractFlexContainerOptions<FlexContainerOptions> {
    public FlexContainerOptions() {
    }

    public FlexContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected FlexContainerOptions self() {
        return this;
    }
}
