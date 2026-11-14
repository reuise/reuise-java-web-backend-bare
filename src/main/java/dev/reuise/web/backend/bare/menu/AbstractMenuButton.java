package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.menu.DefaultWebBackendMenuButton;
import dev.reuise.web.core.bare.menu.BareWebMenuButton;
import dev.reuise.web.core.bare.menu.BareWebMenuButtonPart;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuButtonPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractMenuButton<S extends AbstractMenuButton<S, O>, O extends AbstractMenuButtonOptions<?>> extends DefaultWebBackendMenuButton<S, O> implements BareWebMenuButton , WebBackendComponentPart {
    protected final BareWebMenuButtonPart barePart;

    protected AbstractMenuButton(O options) {
        super(options);
        barePart = new DefaultBareWebMenuButtonPart(options);
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
