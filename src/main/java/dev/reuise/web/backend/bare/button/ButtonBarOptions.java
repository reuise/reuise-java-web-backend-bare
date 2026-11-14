package dev.reuise.web.backend.bare.button;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class ButtonBarOptions extends AbstractButtonBarOptions<ButtonBarOptions> {
    public ButtonBarOptions() {
    }

    public ButtonBarOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ButtonBarOptions self() {
        return this;
    }
}
