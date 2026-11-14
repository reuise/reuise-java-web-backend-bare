package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.checkbox.DefaultWebBackendBasicCheckbox;
import dev.reuise.web.core.bare.checkbox.BareWebBasicCheckbox;
import dev.reuise.web.core.bare.checkbox.BareWebBasicCheckboxPart;
import dev.reuise.web.core.bare.checkbox.DefaultBareWebBasicCheckboxPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractBasicCheckbox<S extends AbstractBasicCheckbox<S, O>, O extends AbstractBasicCheckboxOptions<?>> extends DefaultWebBackendBasicCheckbox<S, O> implements BareWebBasicCheckbox , WebBackendComponentPart {
    protected final BareWebBasicCheckboxPart barePart;

    protected AbstractBasicCheckbox(O options) {
        super(options);
        barePart = new DefaultBareWebBasicCheckboxPart(options);
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
