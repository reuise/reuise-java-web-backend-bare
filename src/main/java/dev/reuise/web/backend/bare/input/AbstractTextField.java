package dev.reuise.web.backend.bare.input;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.DefaultWebBackendTextField;
import dev.reuise.web.core.bare.input.BareWebTextField;
import dev.reuise.web.core.bare.input.BareWebTextFieldPart;
import dev.reuise.web.core.bare.input.DefaultBareWebTextFieldPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTextField<S extends AbstractTextField<S, O>, O extends AbstractTextFieldOptions<?>> extends DefaultWebBackendTextField<S, O> implements WebBackendComponentPart , BareWebTextField {
    protected final BareWebTextFieldPart barePart;

    protected AbstractTextField(O options) {
        super(options);
        barePart = new DefaultBareWebTextFieldPart(options);
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
