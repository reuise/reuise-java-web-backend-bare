package dev.reuise.web.backend.bare.floating;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class FloatingPanelOptions extends AbstractFloatingPanelOptions<FloatingPanelOptions> {
    public FloatingPanelOptions() {
    }

    public FloatingPanelOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected FloatingPanelOptions self() {
        return this;
    }
}
