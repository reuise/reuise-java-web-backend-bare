package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class Surface extends AbstractSurface<Surface, SurfaceOptions> {
    public Surface() {
        this(createOptions());
    }

    public Surface(SurfaceOptions options) {
        super(options);
    }

    public static SurfaceOptions createOptions() {
        return new SurfaceOptions();
    }

    public static Surface create(SurfaceOptions options) {
        return new Surface(options);
    }

    public static Surface create(WebBackendFlexContainerOptions options) {
        return create(new SurfaceOptions(options));
    }

    public static Surface create() {
        return new Surface();
    }

    @Override
    protected Surface self() {
        return this;
    }
}
