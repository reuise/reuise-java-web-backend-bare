package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendHeading;
import dev.reuise.web.core.bare.text.BareWebHeading;
import dev.reuise.web.core.bare.text.BareWebHeadingPart;
import dev.reuise.web.core.bare.text.DefaultBareWebHeadingPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractHeading<S extends AbstractHeading<S, O>, O extends AbstractHeadingOptions<?>> extends DefaultWebBackendHeading<S, O> implements BareWebHeading , WebBackendComponentPart {
    protected final BareWebHeadingPart barePart;

    protected AbstractHeading(O options) {
        super(options);
        barePart = new DefaultBareWebHeadingPart(options);
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
