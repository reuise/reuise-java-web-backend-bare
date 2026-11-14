package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SplitContainer extends AbstractSplitContainer<SplitContainer, SplitContainerOptions> {
    public SplitContainer() {
        this(createOptions());
    }

    public SplitContainer(SplitContainerOptions options) {
        super(options);
    }

    public static SplitContainerOptions createOptions() {
        return new SplitContainerOptions();
    }

    public static SplitContainer create(SplitContainerOptions options) {
        return new SplitContainer(options);
    }

    public static SplitContainer create(WebBackendContainerOptions options) {
        return create(new SplitContainerOptions(options));
    }

    public static SplitContainer create() {
        return new SplitContainer();
    }

    @Override
    protected SplitContainer self() {
        return this;
    }
}
