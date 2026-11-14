package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class SurfaceOptions extends AbstractSurfaceOptions<SurfaceOptions> {
    public SurfaceOptions() {
    }

    public SurfaceOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SurfaceOptions self() {
        return this;
    }
}
