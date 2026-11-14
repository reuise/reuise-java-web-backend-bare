package dev.reuise.web.backend.bare.skeleton;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class SkeletonOptions extends AbstractSkeletonOptions<SkeletonOptions> {
    public SkeletonOptions() {
    }

    public SkeletonOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SkeletonOptions self() {
        return this;
    }
}
