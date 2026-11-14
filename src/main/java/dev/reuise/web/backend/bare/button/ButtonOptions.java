package dev.reuise.web.backend.bare.button;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ButtonOptions extends AbstractButtonOptions<ButtonOptions> {
    public ButtonOptions() {
    }

    public ButtonOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ButtonOptions self() {
        return this;
    }
}
