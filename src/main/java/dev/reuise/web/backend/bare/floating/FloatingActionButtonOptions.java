package dev.reuise.web.backend.bare.floating;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
public class FloatingActionButtonOptions extends AbstractFloatingActionButtonOptions<FloatingActionButtonOptions> {
    public FloatingActionButtonOptions() {
    }

    public FloatingActionButtonOptions(WebBackendButtonOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected FloatingActionButtonOptions self() {
        return this;
    }
}
