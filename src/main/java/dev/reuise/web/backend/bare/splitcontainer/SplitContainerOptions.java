package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SplitContainerOptions extends AbstractSplitContainerOptions<SplitContainerOptions> {
    public SplitContainerOptions() {
    }

    public SplitContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SplitContainerOptions self() {
        return this;
    }
}
