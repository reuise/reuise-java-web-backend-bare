package dev.reuise.web.backend.bare.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.link.AbstractWebBackendLinkOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.link.BareWebLinkPartOptions;
import dev.reuise.web.core.bare.link.DefaultBareWebLinkOptions;
public abstract class AbstractLinkOptions<S extends AbstractLinkOptions<S>> extends AbstractWebBackendLinkOptions<S> implements BareWebLinkPartOptions {
    protected final BareWebLinkPartOptions barePart;

    protected AbstractLinkOptions() {
        this(null);
    }

    protected AbstractLinkOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebLinkOptions();
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
