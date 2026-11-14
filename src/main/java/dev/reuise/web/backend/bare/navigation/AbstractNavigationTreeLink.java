package dev.reuise.web.backend.bare.navigation;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.navigation.DefaultWebBackendNavigationTreeLink;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreeLink;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreeLinkPart;
import dev.reuise.web.core.bare.navigation.DefaultBareWebNavigationTreeLinkPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractNavigationTreeLink<S extends AbstractNavigationTreeLink<S, O>, O extends AbstractNavigationTreeLinkOptions<?>> extends DefaultWebBackendNavigationTreeLink<S, O> implements WebBackendComponentPart , BareWebNavigationTreeLink {
    protected final BareWebNavigationTreeLinkPart barePart;

    protected AbstractNavigationTreeLink(O options) {
        super(options);
        barePart = new DefaultBareWebNavigationTreeLinkPart(options);
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
