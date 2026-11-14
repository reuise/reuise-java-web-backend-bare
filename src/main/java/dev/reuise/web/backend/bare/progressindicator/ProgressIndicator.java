package dev.reuise.web.backend.bare.progressindicator;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ProgressIndicator extends AbstractProgressIndicator<ProgressIndicator, ProgressIndicatorOptions> {
    public ProgressIndicator() {
        this(createOptions());
    }

    public ProgressIndicator(ProgressIndicatorOptions options) {
        super(options);
    }

    public static ProgressIndicatorOptions createOptions() {
        return new ProgressIndicatorOptions();
    }

    public static ProgressIndicator create(ProgressIndicatorOptions options) {
        return new ProgressIndicator(options);
    }

    public static ProgressIndicator create(WebBackendParentComponentOptions options) {
        return create(new ProgressIndicatorOptions(options));
    }

    public static ProgressIndicator create() {
        return new ProgressIndicator();
    }

    @Override
    protected ProgressIndicator self() {
        return this;
    }
}
