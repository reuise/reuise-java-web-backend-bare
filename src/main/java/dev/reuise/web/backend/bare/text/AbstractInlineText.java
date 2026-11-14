package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendInlineText;
import dev.reuise.web.core.bare.text.BareWebInlineText;
import dev.reuise.web.core.bare.text.BareWebInlineTextPart;
import dev.reuise.web.core.bare.text.DefaultBareWebInlineTextPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractInlineText<S extends AbstractInlineText<S, O>, O extends AbstractInlineTextOptions<?>> extends DefaultWebBackendInlineText<S, O> implements WebBackendComponentPart , BareWebInlineText {
    protected final BareWebInlineTextPart barePart;

    protected AbstractInlineText(O options) {
        super(options);
        barePart = new DefaultBareWebInlineTextPart(options);
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
