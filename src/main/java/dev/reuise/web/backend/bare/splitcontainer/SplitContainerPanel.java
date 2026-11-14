package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class SplitContainerPanel extends AbstractSplitContainerPanel<SplitContainerPanel, SplitContainerPanelOptions> {
    public SplitContainerPanel() {
        this(createOptions());
    }

    public SplitContainerPanel(SplitContainerPanelOptions options) {
        super(options);
    }

    public static SplitContainerPanelOptions createOptions() {
        return new SplitContainerPanelOptions();
    }

    public static SplitContainerPanel create(SplitContainerPanelOptions options) {
        return new SplitContainerPanel(options);
    }

    public static SplitContainerPanel create(WebBackendContainerOptions options) {
        return create(new SplitContainerPanelOptions(options));
    }

    public static SplitContainerPanel create() {
        return new SplitContainerPanel();
    }

    @Override
    protected SplitContainerPanel self() {
        return this;
    }
}
