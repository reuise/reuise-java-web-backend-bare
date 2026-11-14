package dev.reuise.web.backend.bare.badge;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.badge.AbstractWebBackendBadgeOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.core.bare.badge.BareWebBadgePartOptions;
import dev.reuise.web.core.bare.badge.DefaultBareWebBadgeOptions;
public abstract class AbstractBadgeOptions<S extends AbstractBadgeOptions<S>> extends AbstractWebBackendBadgeOptions<S> implements BareWebBadgePartOptions {
    protected final BareWebBadgePartOptions barePart;

    protected AbstractBadgeOptions() {
        this(null);
    }

    protected AbstractBadgeOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebBadgeOptions();
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
