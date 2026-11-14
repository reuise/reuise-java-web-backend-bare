package dev.reuise.web.backend.bare.chip;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.chip.DefaultWebBackendChip;
import dev.reuise.web.core.bare.chip.BareWebChip;
import dev.reuise.web.core.bare.chip.BareWebChipPart;
import dev.reuise.web.core.bare.chip.DefaultBareWebChipPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractChip<S extends AbstractChip<S, O>, O extends AbstractChipOptions<?>> extends DefaultWebBackendChip<S, O> implements BareWebChip , WebBackendComponentPart {
    protected final BareWebChipPart barePart;

    protected AbstractChip(O options) {
        super(options);
        barePart = new DefaultBareWebChipPart(options);
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
