package dev.reuise.web.backend.bare.link;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.link.DefaultWebBackendLink;
import dev.reuise.web.core.bare.link.BareWebLink;
import dev.reuise.web.core.bare.link.BareWebLinkPart;
import dev.reuise.web.core.bare.link.DefaultBareWebLinkPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractLink<S extends AbstractLink<S, O>, O extends AbstractLinkOptions<?>> extends DefaultWebBackendLink<S, O> implements BareWebLink , WebBackendComponentPart {
    protected final BareWebLinkPart barePart;

    protected AbstractLink(O options) {
        super(options);
        barePart = new DefaultBareWebLinkPart(options);
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
