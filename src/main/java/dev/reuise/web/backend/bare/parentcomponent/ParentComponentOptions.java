package dev.reuise.web.backend.bare.parentcomponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class ParentComponentOptions extends AbstractParentComponentOptions<ParentComponentOptions> {
    public ParentComponentOptions() {
    }

    public ParentComponentOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ParentComponentOptions self() {
        return this;
    }
}
