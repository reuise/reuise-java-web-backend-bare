package dev.reuise.web.backend.bare.floating;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class FloatingPanel extends AbstractFloatingPanel<FloatingPanel, FloatingPanelOptions> {
    public FloatingPanel() {
        this(createOptions());
    }

    public FloatingPanel(FloatingPanelOptions options) {
        super(options);
    }

    public static FloatingPanelOptions createOptions() {
        return new FloatingPanelOptions();
    }

    public static FloatingPanel create(FloatingPanelOptions options) {
        return new FloatingPanel(options);
    }

    public static FloatingPanel create(WebBackendContainerOptions options) {
        return create(new FloatingPanelOptions(options));
    }

    public static FloatingPanel create() {
        return new FloatingPanel();
    }

    @Override
    protected FloatingPanel self() {
        return this;
    }
}
