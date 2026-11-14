package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class CheckboxOptions extends AbstractCheckboxOptions<CheckboxOptions> {
    public CheckboxOptions() {
    }

    public CheckboxOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CheckboxOptions self() {
        return this;
    }
}
