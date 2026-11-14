package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class FlexContainer extends AbstractFlexContainer<FlexContainer, FlexContainerOptions> {
    public FlexContainer() {
        this(createOptions());
    }

    public FlexContainer(FlexContainerOptions options) {
        super(options);
    }

    public static FlexContainerOptions createOptions() {
        return new FlexContainerOptions();
    }

    public static FlexContainer create(FlexContainerOptions options) {
        return new FlexContainer(options);
    }

    public static FlexContainer create(WebBackendContainerOptions options) {
        return create(new FlexContainerOptions(options));
    }

    public static FlexContainer create() {
        return new FlexContainer();
    }

    @Override
    protected FlexContainer self() {
        return this;
    }
}
