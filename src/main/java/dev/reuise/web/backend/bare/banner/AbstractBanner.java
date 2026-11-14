package dev.reuise.web.backend.bare.banner;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.banner.DefaultWebBackendBanner;
import dev.reuise.web.core.bare.banner.BareWebBanner;
import dev.reuise.web.core.bare.banner.BareWebBannerPart;
import dev.reuise.web.core.bare.banner.DefaultBareWebBannerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractBanner<S extends AbstractBanner<S, O>, O extends AbstractBannerOptions<?>> extends DefaultWebBackendBanner<S, O> implements WebBackendComponentPart , BareWebBanner {
    protected final BareWebBannerPart barePart;

    protected AbstractBanner(O options) {
        super(options);
        barePart = new DefaultBareWebBannerPart(options);
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
