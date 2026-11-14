package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.AbstractWebBackendSurfaceOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.layout.BareWebSurfacePartOptions;
import dev.reuise.web.core.bare.layout.DefaultBareWebSurfaceOptions;
public abstract class AbstractSurfaceOptions<S extends AbstractSurfaceOptions<S>> extends AbstractWebBackendSurfaceOptions<S> implements BareWebSurfacePartOptions {
    protected final BareWebSurfacePartOptions barePart;

    protected AbstractSurfaceOptions() {
        this(null);
    }

    protected AbstractSurfaceOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSurfaceOptions();
        ((BaseComponentOptions) (getBaseComponentPart())).initialize(this);
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    public WebBackendComponentFactory getComponentFactory() {
        return DefaultComponentFactory.get();
    }
}
