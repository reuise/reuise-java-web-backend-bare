package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.splitcontainer.DefaultWebBackendSplitContainerDivider;
import dev.reuise.web.core.bare.splitcontainer.BareWebSplitContainerDivider;
import dev.reuise.web.core.bare.splitcontainer.BareWebSplitContainerDividerPart;
import dev.reuise.web.core.bare.splitcontainer.DefaultBareWebSplitContainerDividerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSplitContainerDivider<S extends AbstractSplitContainerDivider<S, O>, O extends AbstractSplitContainerDividerOptions<?>> extends DefaultWebBackendSplitContainerDivider<S, O> implements WebBackendComponentPart , BareWebSplitContainerDivider {
    protected final BareWebSplitContainerDividerPart barePart;

    protected AbstractSplitContainerDivider(O options) {
        super(options);
        barePart = new DefaultBareWebSplitContainerDividerPart(options);
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
