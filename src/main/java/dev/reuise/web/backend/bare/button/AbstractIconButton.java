package dev.reuise.web.backend.bare.button;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.DefaultWebBackendIconButton;
import dev.reuise.web.core.bare.button.BareWebIconButton;
import dev.reuise.web.core.bare.button.BareWebIconButtonPart;
import dev.reuise.web.core.bare.button.DefaultBareWebIconButtonPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractIconButton<S extends AbstractIconButton<S, O>, O extends AbstractIconButtonOptions<?>> extends DefaultWebBackendIconButton<S, O> implements BareWebIconButton , WebBackendComponentPart {
    protected final BareWebIconButtonPart barePart;

    protected AbstractIconButton(O options) {
        super(options);
        barePart = new DefaultBareWebIconButtonPart(options);
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
