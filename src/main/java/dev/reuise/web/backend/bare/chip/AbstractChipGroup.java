package dev.reuise.web.backend.bare.chip;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.chip.DefaultWebBackendChipGroup;
import dev.reuise.web.core.bare.chip.BareWebChipGroup;
import dev.reuise.web.core.bare.chip.BareWebChipGroupPart;
import dev.reuise.web.core.bare.chip.DefaultBareWebChipGroupPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractChipGroup<S extends AbstractChipGroup<S, O>, O extends AbstractChipGroupOptions<?>> extends DefaultWebBackendChipGroup<S, O> implements WebBackendComponentPart , BareWebChipGroup {
    protected final BareWebChipGroupPart barePart;

    protected AbstractChipGroup(O options) {
        super(options);
        barePart = new DefaultBareWebChipGroupPart(options);
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
