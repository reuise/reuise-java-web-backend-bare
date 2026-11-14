package dev.reuise.web.backend.bare.chip;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.chip.DefaultWebBackendFilterChip;
import dev.reuise.web.core.bare.chip.BareWebFilterChip;
import dev.reuise.web.core.bare.chip.BareWebFilterChipPart;
import dev.reuise.web.core.bare.chip.DefaultBareWebFilterChipPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractFilterChip<S extends AbstractFilterChip<S, O>, O extends AbstractFilterChipOptions<?>> extends DefaultWebBackendFilterChip<S, O> implements BareWebFilterChip , WebBackendComponentPart {
    protected final BareWebFilterChipPart barePart;

    protected AbstractFilterChip(O options) {
        super(options);
        barePart = new DefaultBareWebFilterChipPart(options);
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
