package dev.reuise.web.backend.bare.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.link.WebBackendNavigationLinkOptions;
import dev.reuise.web.backend.navigation.AbstractWebBackendNavigationTreeLinkOptions;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreeLinkPartOptions;
import dev.reuise.web.core.bare.navigation.DefaultBareWebNavigationTreeLinkOptions;
public abstract class AbstractNavigationTreeLinkOptions<S extends AbstractNavigationTreeLinkOptions<S>> extends AbstractWebBackendNavigationTreeLinkOptions<S> implements BareWebNavigationTreeLinkPartOptions {
    protected final BareWebNavigationTreeLinkPartOptions barePart;

    protected AbstractNavigationTreeLinkOptions() {
        this(null);
    }

    protected AbstractNavigationTreeLinkOptions(WebBackendNavigationLinkOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebNavigationTreeLinkOptions();
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
