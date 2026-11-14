package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SplitContainerPanelOptions extends AbstractSplitContainerPanelOptions<SplitContainerPanelOptions> {
    public SplitContainerPanelOptions() {
    }

    public SplitContainerPanelOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SplitContainerPanelOptions self() {
        return this;
    }
}
