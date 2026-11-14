package dev.reuise.web.backend.bare.progressindicator;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ProgressIndicatorOptions extends AbstractProgressIndicatorOptions<ProgressIndicatorOptions> {
    public ProgressIndicatorOptions() {
    }

    public ProgressIndicatorOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ProgressIndicatorOptions self() {
        return this;
    }
}
