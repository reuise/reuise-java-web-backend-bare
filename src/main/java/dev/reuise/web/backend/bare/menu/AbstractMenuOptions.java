package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.menu.AbstractWebBackendMenuOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.menu.BareWebMenuPartOptions;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuOptions;
public abstract class AbstractMenuOptions<S extends AbstractMenuOptions<S>> extends AbstractWebBackendMenuOptions<S> implements BareWebMenuPartOptions {
    protected final BareWebMenuPartOptions barePart;

    protected AbstractMenuOptions() {
        this(null);
    }

    protected AbstractMenuOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMenuOptions();
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
