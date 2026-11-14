package dev.reuise.web.backend.bare.input;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.DefaultWebBackendSegmentedTextField;
import dev.reuise.web.core.bare.input.BareWebSegmentedTextField;
import dev.reuise.web.core.bare.input.BareWebSegmentedTextFieldPart;
import dev.reuise.web.core.bare.input.DefaultBareWebSegmentedTextFieldPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSegmentedTextField<S extends AbstractSegmentedTextField<S, O>, O extends AbstractSegmentedTextFieldOptions<?>> extends DefaultWebBackendSegmentedTextField<S, O> implements WebBackendComponentPart , BareWebSegmentedTextField {
    protected final BareWebSegmentedTextFieldPart barePart;

    protected AbstractSegmentedTextField(O options) {
        super(options);
        barePart = new DefaultBareWebSegmentedTextFieldPart(options);
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
