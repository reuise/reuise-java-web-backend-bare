package dev.reuise.web.backend.bare.button;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Button extends AbstractButton<Button, ButtonOptions> {
    public Button() {
        this(createOptions());
    }

    public Button(ButtonOptions options) {
        super(options);
    }

    public static ButtonOptions createOptions() {
        return new ButtonOptions();
    }

    public static Button create(ButtonOptions options) {
        return new Button(options);
    }

    public static Button create(WebBackendParentComponentOptions options) {
        return create(new ButtonOptions(options));
    }

    public static Button create() {
        return new Button();
    }

    @Override
    protected Button self() {
        return this;
    }
}
