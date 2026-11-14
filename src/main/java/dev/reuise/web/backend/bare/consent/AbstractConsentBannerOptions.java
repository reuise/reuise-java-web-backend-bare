package dev.reuise.web.backend.bare.consent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.consent.AbstractWebBackendConsentBannerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.consent.BareWebConsentBannerPartOptions;
import dev.reuise.web.core.bare.consent.DefaultBareWebConsentBannerOptions;
public abstract class AbstractConsentBannerOptions<S extends AbstractConsentBannerOptions<S>> extends AbstractWebBackendConsentBannerOptions<S> implements BareWebConsentBannerPartOptions {
    protected final BareWebConsentBannerPartOptions barePart;

    protected AbstractConsentBannerOptions() {
        this(null);
    }

    protected AbstractConsentBannerOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebConsentBannerOptions();
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
