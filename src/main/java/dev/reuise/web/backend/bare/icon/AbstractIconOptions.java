package dev.reuise.web.backend.bare.icon;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.icon.AbstractWebBackendIconOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.icon.BareWebIconPartOptions;
import dev.reuise.web.core.bare.icon.DefaultBareWebIconOptions;
public abstract class AbstractIconOptions<S extends AbstractIconOptions<S>> extends AbstractWebBackendIconOptions<S> implements BareWebIconPartOptions {
    protected final BareWebIconPartOptions barePart;

    protected AbstractIconOptions() {
        this(null);
    }

    protected AbstractIconOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebIconOptions();
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
