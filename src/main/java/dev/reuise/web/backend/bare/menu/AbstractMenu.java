package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.menu.DefaultWebBackendMenu;
import dev.reuise.web.core.bare.menu.BareWebMenu;
import dev.reuise.web.core.bare.menu.BareWebMenuPart;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractMenu<S extends AbstractMenu<S, O>, O extends AbstractMenuOptions<?>> extends DefaultWebBackendMenu<S, O> implements BareWebMenu , WebBackendComponentPart {
    protected final BareWebMenuPart barePart;

    protected AbstractMenu(O options) {
        super(options);
        barePart = new DefaultBareWebMenuPart(options);
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
