package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.menu.AbstractWebBackendMenuButtonItemOptions;
import dev.reuise.web.core.bare.menu.BareWebMenuButtonItemPartOptions;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuButtonItemOptions;
public abstract class AbstractMenuButtonItemOptions<S extends AbstractMenuButtonItemOptions<S>> extends AbstractWebBackendMenuButtonItemOptions<S> implements BareWebMenuButtonItemPartOptions {
    protected final BareWebMenuButtonItemPartOptions barePart;

    protected AbstractMenuButtonItemOptions() {
        this(null);
    }

    protected AbstractMenuButtonItemOptions(WebBackendButtonOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMenuButtonItemOptions();
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
