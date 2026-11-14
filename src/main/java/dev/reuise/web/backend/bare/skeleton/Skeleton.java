package dev.reuise.web.backend.bare.skeleton;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class Skeleton extends AbstractSkeleton<Skeleton, SkeletonOptions> {
    public Skeleton() {
        this(createOptions());
    }

    public Skeleton(SkeletonOptions options) {
        super(options);
    }

    public static SkeletonOptions createOptions() {
        return new SkeletonOptions();
    }

    public static Skeleton create(SkeletonOptions options) {
        return new Skeleton(options);
    }

    public static Skeleton create(WebBackendBaseComponentOptions options) {
        return create(new SkeletonOptions(options));
    }

    public static Skeleton create() {
        return new Skeleton();
    }

    @Override
    protected Skeleton self() {
        return this;
    }
}
