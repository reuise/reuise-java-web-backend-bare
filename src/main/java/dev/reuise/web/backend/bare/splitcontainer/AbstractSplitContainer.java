package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.splitcontainer.DefaultWebBackendSplitContainer;
import dev.reuise.web.core.bare.splitcontainer.BareWebSplitContainer;
import dev.reuise.web.core.bare.splitcontainer.BareWebSplitContainerPart;
import dev.reuise.web.core.bare.splitcontainer.DefaultBareWebSplitContainerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSplitContainer<S extends AbstractSplitContainer<S, O>, O extends AbstractSplitContainerOptions<?>> extends DefaultWebBackendSplitContainer<S, O> implements WebBackendComponentPart , BareWebSplitContainer {
    protected final BareWebSplitContainerPart barePart;

    protected AbstractSplitContainer(O options) {
        super(options);
        barePart = new DefaultBareWebSplitContainerPart(options);
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
