package dev.reuise.web.backend.bare.divider;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class DividerOptions extends AbstractDividerOptions<DividerOptions> {
    public DividerOptions() {
    }

    public DividerOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected DividerOptions self() {
        return this;
    }
}
