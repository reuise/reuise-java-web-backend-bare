package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendLineBreak;
import dev.reuise.web.core.bare.text.BareWebLineBreak;
import dev.reuise.web.core.bare.text.BareWebLineBreakPart;
import dev.reuise.web.core.bare.text.DefaultBareWebLineBreakPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractLineBreak<S extends AbstractLineBreak<S, O>, O extends AbstractLineBreakOptions<?>> extends DefaultWebBackendLineBreak<S, O> implements BareWebLineBreak , WebBackendComponentPart {
    protected final BareWebLineBreakPart barePart;

    protected AbstractLineBreak(O options) {
        super(options);
        barePart = new DefaultBareWebLineBreakPart(options);
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
