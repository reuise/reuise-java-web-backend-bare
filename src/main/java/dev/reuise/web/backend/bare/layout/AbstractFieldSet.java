package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.DefaultWebBackendFieldSet;
import dev.reuise.web.core.bare.layout.BareWebFieldSet;
import dev.reuise.web.core.bare.layout.BareWebFieldSetPart;
import dev.reuise.web.core.bare.layout.DefaultBareWebFieldSetPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractFieldSet<S extends AbstractFieldSet<S, O>, O extends AbstractFieldSetOptions<?>> extends DefaultWebBackendFieldSet<S, O> implements BareWebFieldSet , WebBackendComponentPart {
    protected final BareWebFieldSetPart barePart;

    protected AbstractFieldSet(O options) {
        super(options);
        barePart = new DefaultBareWebFieldSetPart(options);
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
