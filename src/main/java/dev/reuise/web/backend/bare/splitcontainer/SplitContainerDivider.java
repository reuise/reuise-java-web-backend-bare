package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SplitContainerDivider extends AbstractSplitContainerDivider<SplitContainerDivider, SplitContainerDividerOptions> {
    public SplitContainerDivider() {
        this(createOptions());
    }

    public SplitContainerDivider(SplitContainerDividerOptions options) {
        super(options);
    }

    public static SplitContainerDividerOptions createOptions() {
        return new SplitContainerDividerOptions();
    }

    public static SplitContainerDivider create(SplitContainerDividerOptions options) {
        return new SplitContainerDivider(options);
    }

    public static SplitContainerDivider create(WebBackendContainerOptions options) {
        return create(new SplitContainerDividerOptions(options));
    }

    public static SplitContainerDivider create() {
        return new SplitContainerDivider();
    }

    @Override
    protected SplitContainerDivider self() {
        return this;
    }
}
