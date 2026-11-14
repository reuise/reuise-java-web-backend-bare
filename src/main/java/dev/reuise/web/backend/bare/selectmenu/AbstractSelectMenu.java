package dev.reuise.web.backend.bare.selectmenu;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.selectmenu.DefaultWebBackendSelectMenu;
import dev.reuise.web.core.bare.selectmenu.BareWebSelectMenu;
import dev.reuise.web.core.bare.selectmenu.BareWebSelectMenuPart;
import dev.reuise.web.core.bare.selectmenu.DefaultBareWebSelectMenuPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSelectMenu<S extends AbstractSelectMenu<S, O>, O extends AbstractSelectMenuOptions<?>> extends DefaultWebBackendSelectMenu<S, O> implements BareWebSelectMenu , WebBackendComponentPart {
    protected final BareWebSelectMenuPart barePart;

    protected AbstractSelectMenu(O options) {
        super(options);
        barePart = new DefaultBareWebSelectMenuPart(options);
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
