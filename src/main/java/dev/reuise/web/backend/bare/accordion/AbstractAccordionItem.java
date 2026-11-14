package dev.reuise.web.backend.bare.accordion;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.accordion.DefaultWebBackendAccordionItem;
import dev.reuise.web.core.bare.accordion.BareWebAccordionItem;
import dev.reuise.web.core.bare.accordion.BareWebAccordionItemPart;
import dev.reuise.web.core.bare.accordion.DefaultBareWebAccordionItemPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractAccordionItem<S extends AbstractAccordionItem<S, O>, O extends AbstractAccordionItemOptions<?>> extends DefaultWebBackendAccordionItem<S, O> implements BareWebAccordionItem , WebBackendComponentPart {
    protected final BareWebAccordionItemPart barePart;

    protected AbstractAccordionItem(O options) {
        super(options);
        barePart = new DefaultBareWebAccordionItemPart(options);
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
