package dev.reuise.web.backend.bare.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.link.AbstractWebBackendNavigationLinkOptions;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.core.bare.link.BareWebNavigationLinkPartOptions;
import dev.reuise.web.core.bare.link.DefaultBareWebNavigationLinkOptions;
public abstract class AbstractNavigationLinkOptions<S extends AbstractNavigationLinkOptions<S>> extends AbstractWebBackendNavigationLinkOptions<S> implements BareWebNavigationLinkPartOptions {
    protected final BareWebNavigationLinkPartOptions barePart;

    protected AbstractNavigationLinkOptions() {
        this(null);
    }

    protected AbstractNavigationLinkOptions(WebBackendLinkOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebNavigationLinkOptions();
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
