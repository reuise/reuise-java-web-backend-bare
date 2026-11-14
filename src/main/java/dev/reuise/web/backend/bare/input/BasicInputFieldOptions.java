package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class BasicInputFieldOptions extends AbstractBasicInputFieldOptions<BasicInputFieldOptions> {
    public BasicInputFieldOptions() {
    }

    public BasicInputFieldOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected BasicInputFieldOptions self() {
        return this;
    }
}
