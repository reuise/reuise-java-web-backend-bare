package dev.reuise.web.backend.bare.link;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.link.DefaultWebBackendNavigationLink;
import dev.reuise.web.core.bare.link.BareWebNavigationLink;
import dev.reuise.web.core.bare.link.BareWebNavigationLinkPart;
import dev.reuise.web.core.bare.link.DefaultBareWebNavigationLinkPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractNavigationLink<S extends AbstractNavigationLink<S, O>, O extends AbstractNavigationLinkOptions<?>> extends DefaultWebBackendNavigationLink<S, O> implements BareWebNavigationLink , WebBackendComponentPart {
    protected final BareWebNavigationLinkPart barePart;

    protected AbstractNavigationLink(O options) {
        super(options);
        barePart = new DefaultBareWebNavigationLinkPart(options);
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
