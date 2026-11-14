package dev.reuise.web.backend.bare.accordion;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.accordion.DefaultWebBackendAccordion;
import dev.reuise.web.core.bare.accordion.BareWebAccordion;
import dev.reuise.web.core.bare.accordion.BareWebAccordionPart;
import dev.reuise.web.core.bare.accordion.DefaultBareWebAccordionPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractAccordion<S extends AbstractAccordion<S, O>, O extends AbstractAccordionOptions<?>> extends DefaultWebBackendAccordion<S, O> implements BareWebAccordion , WebBackendComponentPart {
    protected final BareWebAccordionPart barePart;

    protected AbstractAccordion(O options) {
        super(options);
        barePart = new DefaultBareWebAccordionPart(options);
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
