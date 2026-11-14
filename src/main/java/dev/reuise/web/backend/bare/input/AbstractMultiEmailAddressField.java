package dev.reuise.web.backend.bare.input;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.DefaultWebBackendMultiEmailAddressField;
import dev.reuise.web.core.bare.input.BareWebMultiEmailAddressField;
import dev.reuise.web.core.bare.input.BareWebMultiEmailAddressFieldPart;
import dev.reuise.web.core.bare.input.DefaultBareWebMultiEmailAddressFieldPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractMultiEmailAddressField<S extends AbstractMultiEmailAddressField<S, O>, O extends AbstractMultiEmailAddressFieldOptions<?>> extends DefaultWebBackendMultiEmailAddressField<S, O> implements BareWebMultiEmailAddressField , WebBackendComponentPart {
    protected final BareWebMultiEmailAddressFieldPart barePart;

    protected AbstractMultiEmailAddressField(O options) {
        super(options);
        barePart = new DefaultBareWebMultiEmailAddressFieldPart(options);
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
