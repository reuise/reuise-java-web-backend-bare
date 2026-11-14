package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.scrollablecontainer.DefaultWebBackendScrollableContainer;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainer;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerPart;
import dev.reuise.web.core.bare.scrollablecontainer.DefaultBareWebScrollableContainerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractScrollableContainer<S extends AbstractScrollableContainer<S, O>, O extends AbstractScrollableContainerOptions<?>> extends DefaultWebBackendScrollableContainer<S, O> implements WebBackendComponentPart , BareWebScrollableContainer {
    protected final BareWebScrollableContainerPart barePart;

    protected AbstractScrollableContainer(O options) {
        super(options);
        barePart = new DefaultBareWebScrollableContainerPart(options);
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
