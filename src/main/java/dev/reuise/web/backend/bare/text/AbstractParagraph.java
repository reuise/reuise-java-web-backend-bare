package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendParagraph;
import dev.reuise.web.core.bare.text.BareWebParagraph;
import dev.reuise.web.core.bare.text.BareWebParagraphPart;
import dev.reuise.web.core.bare.text.DefaultBareWebParagraphPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractParagraph<S extends AbstractParagraph<S, O>, O extends AbstractParagraphOptions<?>> extends DefaultWebBackendParagraph<S, O> implements BareWebParagraph , WebBackendComponentPart {
    protected final BareWebParagraphPart barePart;

    protected AbstractParagraph(O options) {
        super(options);
        barePart = new DefaultBareWebParagraphPart(options);
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
