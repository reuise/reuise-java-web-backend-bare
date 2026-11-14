package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.menu.AbstractWebBackendMenuButtonOptions;
import dev.reuise.web.core.bare.menu.BareWebMenuButtonPartOptions;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuButtonOptions;
public abstract class AbstractMenuButtonOptions<S extends AbstractMenuButtonOptions<S>> extends AbstractWebBackendMenuButtonOptions<S> implements BareWebMenuButtonPartOptions {
    protected final BareWebMenuButtonPartOptions barePart;

    protected AbstractMenuButtonOptions() {
        this(null);
    }

    protected AbstractMenuButtonOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMenuButtonOptions();
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
