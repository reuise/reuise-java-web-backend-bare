package dev.reuise.web.backend.bare.card;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.card.DefaultWebBackendCard;
import dev.reuise.web.core.bare.card.BareWebCard;
import dev.reuise.web.core.bare.card.BareWebCardPart;
import dev.reuise.web.core.bare.card.DefaultBareWebCardPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCard<S extends AbstractCard<S, O>, O extends AbstractCardOptions<?>> extends DefaultWebBackendCard<S, O> implements BareWebCard , WebBackendComponentPart {
    protected final BareWebCardPart barePart;

    protected AbstractCard(O options) {
        super(options);
        barePart = new DefaultBareWebCardPart(options);
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
