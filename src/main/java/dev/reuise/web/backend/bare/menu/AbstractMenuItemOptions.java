package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.list.WebBackendListItemOptions;
import dev.reuise.web.backend.menu.AbstractWebBackendMenuItemOptions;
import dev.reuise.web.core.bare.menu.BareWebMenuItemPartOptions;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuItemOptions;
public abstract class AbstractMenuItemOptions<S extends AbstractMenuItemOptions<S>> extends AbstractWebBackendMenuItemOptions<S> implements BareWebMenuItemPartOptions {
    protected final BareWebMenuItemPartOptions barePart;

    protected AbstractMenuItemOptions() {
        this(null);
    }

    protected AbstractMenuItemOptions(WebBackendListItemOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMenuItemOptions();
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
