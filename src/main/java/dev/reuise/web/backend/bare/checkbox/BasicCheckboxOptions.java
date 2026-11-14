package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class BasicCheckboxOptions extends AbstractBasicCheckboxOptions<BasicCheckboxOptions> {
    public BasicCheckboxOptions() {
    }

    public BasicCheckboxOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected BasicCheckboxOptions self() {
        return this;
    }
}
