package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.DefaultWebBackendFlexContainer;
import dev.reuise.web.core.bare.layout.BareWebFlexContainer;
import dev.reuise.web.core.bare.layout.BareWebFlexContainerPart;
import dev.reuise.web.core.bare.layout.DefaultBareWebFlexContainerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractFlexContainer<S extends AbstractFlexContainer<S, O>, O extends AbstractFlexContainerOptions<?>> extends DefaultWebBackendFlexContainer<S, O> implements BareWebFlexContainer , WebBackendComponentPart {
    protected final BareWebFlexContainerPart barePart;

    protected AbstractFlexContainer(O options) {
        super(options);
        barePart = new DefaultBareWebFlexContainerPart(options);
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
