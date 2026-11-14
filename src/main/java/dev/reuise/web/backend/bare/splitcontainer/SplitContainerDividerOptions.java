package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SplitContainerDividerOptions extends AbstractSplitContainerDividerOptions<SplitContainerDividerOptions> {
    public SplitContainerDividerOptions() {
    }

    public SplitContainerDividerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SplitContainerDividerOptions self() {
        return this;
    }
}
