package dev.reuise.web.backend.bare.tabs;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.tabs.AbstractWebBackendTabOptions;
import dev.reuise.web.core.bare.tabs.BareWebTabPartOptions;
import dev.reuise.web.core.bare.tabs.DefaultBareWebTabOptions;
public abstract class AbstractTabOptions<S extends AbstractTabOptions<S>> extends AbstractWebBackendTabOptions<S> implements BareWebTabPartOptions {
    protected final BareWebTabPartOptions barePart;

    protected AbstractTabOptions() {
        this(null);
    }

    protected AbstractTabOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTabOptions();
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
