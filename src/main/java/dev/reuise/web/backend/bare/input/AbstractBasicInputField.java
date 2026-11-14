package dev.reuise.web.backend.bare.input;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.DefaultWebBackendBasicInputField;
import dev.reuise.web.core.bare.input.BareWebBasicInputField;
import dev.reuise.web.core.bare.input.BareWebBasicInputFieldPart;
import dev.reuise.web.core.bare.input.DefaultBareWebBasicInputFieldPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractBasicInputField<S extends AbstractBasicInputField<S, O>, O extends AbstractBasicInputFieldOptions<?>> extends DefaultWebBackendBasicInputField<S, O> implements WebBackendComponentPart , BareWebBasicInputField {
    protected final BareWebBasicInputFieldPart barePart;

    protected AbstractBasicInputField(O options) {
        super(options);
        barePart = new DefaultBareWebBasicInputFieldPart(options);
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
