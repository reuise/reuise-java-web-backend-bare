package dev.reuise.web.backend.bare.input;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.DefaultWebBackendChipField;
import dev.reuise.web.core.bare.input.BareWebChipField;
import dev.reuise.web.core.bare.input.BareWebChipFieldPart;
import dev.reuise.web.core.bare.input.DefaultBareWebChipFieldPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractChipField<S extends AbstractChipField<S, O>, O extends AbstractChipFieldOptions<?>> extends DefaultWebBackendChipField<S, O> implements WebBackendComponentPart , BareWebChipField {
    protected final BareWebChipFieldPart barePart;

    protected AbstractChipField(O options) {
        super(options);
        barePart = new DefaultBareWebChipFieldPart(options);
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
