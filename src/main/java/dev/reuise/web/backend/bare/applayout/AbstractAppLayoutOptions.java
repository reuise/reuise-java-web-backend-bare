package dev.reuise.web.backend.bare.applayout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.applayout.AbstractWebBackendAppLayoutOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.applayout.BareWebAppLayoutPartOptions;
import dev.reuise.web.core.bare.applayout.DefaultBareWebAppLayoutOptions;
public abstract class AbstractAppLayoutOptions<S extends AbstractAppLayoutOptions<S>> extends AbstractWebBackendAppLayoutOptions<S> implements BareWebAppLayoutPartOptions {
    protected final BareWebAppLayoutPartOptions barePart;

    protected AbstractAppLayoutOptions() {
        this(null);
    }

    protected AbstractAppLayoutOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebAppLayoutOptions();
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
