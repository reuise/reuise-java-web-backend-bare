package dev.reuise.web.backend.bare.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.button.AbstractWebBackendIconButtonOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.button.BareWebIconButtonPartOptions;
import dev.reuise.web.core.bare.button.DefaultBareWebIconButtonOptions;
public abstract class AbstractIconButtonOptions<S extends AbstractIconButtonOptions<S>> extends AbstractWebBackendIconButtonOptions<S> implements BareWebIconButtonPartOptions {
    protected final BareWebIconButtonPartOptions barePart;

    protected AbstractIconButtonOptions() {
        this(null);
    }

    protected AbstractIconButtonOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebIconButtonOptions();
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
