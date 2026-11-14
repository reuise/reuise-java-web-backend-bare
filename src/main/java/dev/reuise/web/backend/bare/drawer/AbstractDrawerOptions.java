package dev.reuise.web.backend.bare.drawer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.drawer.AbstractWebBackendDrawerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.drawer.BareWebDrawerPartOptions;
import dev.reuise.web.core.bare.drawer.DefaultBareWebDrawerOptions;
public abstract class AbstractDrawerOptions<S extends AbstractDrawerOptions<S>> extends AbstractWebBackendDrawerOptions<S> implements BareWebDrawerPartOptions {
    protected final BareWebDrawerPartOptions barePart;

    protected AbstractDrawerOptions() {
        this(null);
    }

    protected AbstractDrawerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebDrawerOptions();
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
