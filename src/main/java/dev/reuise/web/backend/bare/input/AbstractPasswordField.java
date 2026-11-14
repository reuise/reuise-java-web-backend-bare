package dev.reuise.web.backend.bare.input;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.DefaultWebBackendPasswordField;
import dev.reuise.web.core.bare.input.BareWebPasswordField;
import dev.reuise.web.core.bare.input.BareWebPasswordFieldPart;
import dev.reuise.web.core.bare.input.DefaultBareWebPasswordFieldPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractPasswordField<S extends AbstractPasswordField<S, O>, O extends AbstractPasswordFieldOptions<?>> extends DefaultWebBackendPasswordField<S, O> implements BareWebPasswordField , WebBackendComponentPart {
    protected final BareWebPasswordFieldPart barePart;

    protected AbstractPasswordField(O options) {
        super(options);
        barePart = new DefaultBareWebPasswordFieldPart(options);
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
