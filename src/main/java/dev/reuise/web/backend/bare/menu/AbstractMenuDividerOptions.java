package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.menu.AbstractWebBackendMenuDividerOptions;
import dev.reuise.web.backend.menu.WebBackendMenuItemOptions;
import dev.reuise.web.core.bare.menu.BareWebMenuDividerPartOptions;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuDividerOptions;
public abstract class AbstractMenuDividerOptions<S extends AbstractMenuDividerOptions<S>> extends AbstractWebBackendMenuDividerOptions<S> implements BareWebMenuDividerPartOptions {
    protected final BareWebMenuDividerPartOptions barePart;

    protected AbstractMenuDividerOptions() {
        this(null);
    }

    protected AbstractMenuDividerOptions(WebBackendMenuItemOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMenuDividerOptions();
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
