package dev.reuise.web.backend.bare.button;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class ButtonBar extends AbstractButtonBar<ButtonBar, ButtonBarOptions> {
    public ButtonBar() {
        this(createOptions());
    }

    public ButtonBar(ButtonBarOptions options) {
        super(options);
    }

    public static ButtonBarOptions createOptions() {
        return new ButtonBarOptions();
    }

    public static ButtonBar create(ButtonBarOptions options) {
        return new ButtonBar(options);
    }

    public static ButtonBar create(WebBackendFlexContainerOptions options) {
        return create(new ButtonBarOptions(options));
    }

    public static ButtonBar create() {
        return new ButtonBar();
    }

    @Override
    protected ButtonBar self() {
        return this;
    }
}
