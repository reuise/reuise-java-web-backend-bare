package dev.reuise.web.backend.bare.badge;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.badge.DefaultWebBackendBadge;
import dev.reuise.web.core.bare.badge.BareWebBadge;
import dev.reuise.web.core.bare.badge.BareWebBadgePart;
import dev.reuise.web.core.bare.badge.DefaultBareWebBadgePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractBadge<S extends AbstractBadge<S, O>, O extends AbstractBadgeOptions<?>> extends DefaultWebBackendBadge<S, O> implements BareWebBadge , WebBackendComponentPart {
    protected final BareWebBadgePart barePart;

    protected AbstractBadge(O options) {
        super(options);
        barePart = new DefaultBareWebBadgePart(options);
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
