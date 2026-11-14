package dev.reuise.web.backend.bare.button;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.DefaultWebBackendButtonBar;
import dev.reuise.web.core.bare.button.BareWebButtonBar;
import dev.reuise.web.core.bare.button.BareWebButtonBarPart;
import dev.reuise.web.core.bare.button.DefaultBareWebButtonBarPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractButtonBar<S extends AbstractButtonBar<S, O>, O extends AbstractButtonBarOptions<?>> extends DefaultWebBackendButtonBar<S, O> implements WebBackendComponentPart , BareWebButtonBar {
    protected final BareWebButtonBarPart barePart;

    protected AbstractButtonBar(O options) {
        super(options);
        barePart = new DefaultBareWebButtonBarPart(options);
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
