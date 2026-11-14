package dev.reuise.web.backend.bare.parentcomponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.AbstractWebBackendParentComponentOptions;
import dev.reuise.web.core.bare.parentcomponent.BareWebParentComponentPartOptions;
import dev.reuise.web.core.bare.parentcomponent.DefaultBareWebParentComponentOptions;
public abstract class AbstractParentComponentOptions<S extends AbstractParentComponentOptions<S>> extends AbstractWebBackendParentComponentOptions<S> implements BareWebParentComponentPartOptions {
    protected final BareWebParentComponentPartOptions barePart;

    protected AbstractParentComponentOptions() {
        this(null);
    }

    protected AbstractParentComponentOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebParentComponentOptions();
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
