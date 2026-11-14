package dev.reuise.web.backend.bare.tabs;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.tabs.AbstractWebBackendTabBarOptions;
import dev.reuise.web.core.bare.tabs.BareWebTabBarPartOptions;
import dev.reuise.web.core.bare.tabs.DefaultBareWebTabBarOptions;
public abstract class AbstractTabBarOptions<S extends AbstractTabBarOptions<S>> extends AbstractWebBackendTabBarOptions<S> implements BareWebTabBarPartOptions {
    protected final BareWebTabBarPartOptions barePart;

    protected AbstractTabBarOptions() {
        this(null);
    }

    protected AbstractTabBarOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTabBarOptions();
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
