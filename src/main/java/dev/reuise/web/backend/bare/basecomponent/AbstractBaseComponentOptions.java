package dev.reuise.web.backend.bare.basecomponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.basecomponent.AbstractWebBackendBaseComponentOptions;
import dev.reuise.web.core.bare.basecomponent.BareWebBaseComponentPartOptions;
import dev.reuise.web.core.bare.basecomponent.DefaultBareWebBaseComponentOptions;
public abstract class AbstractBaseComponentOptions<S extends AbstractBaseComponentOptions<S>> extends AbstractWebBackendBaseComponentOptions<S> implements BareWebBaseComponentPartOptions {
    protected final BareWebBaseComponentPartOptions barePart;

    protected AbstractBaseComponentOptions() {
        barePart = new DefaultBareWebBaseComponentOptions();
        initialize(this);
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
