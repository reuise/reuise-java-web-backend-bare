package dev.reuise.web.backend.bare.divider;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.divider.DefaultWebBackendDivider;
import dev.reuise.web.core.bare.divider.BareWebDivider;
import dev.reuise.web.core.bare.divider.BareWebDividerPart;
import dev.reuise.web.core.bare.divider.DefaultBareWebDividerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractDivider<S extends AbstractDivider<S, O>, O extends AbstractDividerOptions<?>> extends DefaultWebBackendDivider<S, O> implements BareWebDivider , WebBackendComponentPart {
    protected final BareWebDividerPart barePart;

    protected AbstractDivider(O options) {
        super(options);
        barePart = new DefaultBareWebDividerPart(options);
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
