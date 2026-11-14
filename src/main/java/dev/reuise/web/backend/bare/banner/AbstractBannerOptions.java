package dev.reuise.web.backend.bare.banner;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.banner.AbstractWebBackendBannerOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.banner.BareWebBannerPartOptions;
import dev.reuise.web.core.bare.banner.DefaultBareWebBannerOptions;
public abstract class AbstractBannerOptions<S extends AbstractBannerOptions<S>> extends AbstractWebBackendBannerOptions<S> implements BareWebBannerPartOptions {
    protected final BareWebBannerPartOptions barePart;

    protected AbstractBannerOptions() {
        this(null);
    }

    protected AbstractBannerOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebBannerOptions();
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
