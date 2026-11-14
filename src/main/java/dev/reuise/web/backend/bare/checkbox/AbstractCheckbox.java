package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.checkbox.DefaultWebBackendCheckbox;
import dev.reuise.web.core.bare.checkbox.BareWebCheckbox;
import dev.reuise.web.core.bare.checkbox.BareWebCheckboxPart;
import dev.reuise.web.core.bare.checkbox.DefaultBareWebCheckboxPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCheckbox<S extends AbstractCheckbox<S, O>, O extends AbstractCheckboxOptions<?>> extends DefaultWebBackendCheckbox<S, O> implements WebBackendComponentPart , BareWebCheckbox {
    protected final BareWebCheckboxPart barePart;

    protected AbstractCheckbox(O options) {
        super(options);
        barePart = new DefaultBareWebCheckboxPart(options);
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
