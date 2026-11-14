package dev.reuise.web.backend.bare.floating;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
public class FloatingActionButton extends AbstractFloatingActionButton<FloatingActionButton, FloatingActionButtonOptions> {
    public FloatingActionButton() {
        this(createOptions());
    }

    public FloatingActionButton(FloatingActionButtonOptions options) {
        super(options);
    }

    public static FloatingActionButtonOptions createOptions() {
        return new FloatingActionButtonOptions();
    }

    public static FloatingActionButton create(FloatingActionButtonOptions options) {
        return new FloatingActionButton(options);
    }

    public static FloatingActionButton create(WebBackendButtonOptions options) {
        return create(new FloatingActionButtonOptions(options));
    }

    public static FloatingActionButton create() {
        return new FloatingActionButton();
    }

    @Override
    protected FloatingActionButton self() {
        return this;
    }
}
