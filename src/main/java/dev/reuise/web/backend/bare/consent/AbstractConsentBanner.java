package dev.reuise.web.backend.bare.consent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.consent.DefaultWebBackendConsentBanner;
import dev.reuise.web.core.bare.consent.BareWebConsentBanner;
import dev.reuise.web.core.bare.consent.BareWebConsentBannerPart;
import dev.reuise.web.core.bare.consent.DefaultBareWebConsentBannerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractConsentBanner<S extends AbstractConsentBanner<S, O>, O extends AbstractConsentBannerOptions<?>> extends DefaultWebBackendConsentBanner<S, O> implements BareWebConsentBanner , WebBackendComponentPart {
    protected final BareWebConsentBannerPart barePart;

    protected AbstractConsentBanner(O options) {
        super(options);
        barePart = new DefaultBareWebConsentBannerPart(options);
        if (options == null)
            return;

        // addPart(ComponentPart.Type.DESIGN, barePart)
        initialize(self(), options);
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}
