package dev.reuise.web.backend.bare.button;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.DefaultWebBackendButton;
import dev.reuise.web.core.bare.button.BareWebButton;
import dev.reuise.web.core.bare.button.BareWebButtonPart;
import dev.reuise.web.core.bare.button.DefaultBareWebButtonPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractButton<S extends AbstractButton<S, O>, O extends AbstractButtonOptions<?>> extends DefaultWebBackendButton<S, O> implements WebBackendComponentPart , BareWebButton {
    protected final BareWebButtonPart barePart;

    protected AbstractButton(O options) {
        super(options);
        barePart = new DefaultBareWebButtonPart(options);
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
