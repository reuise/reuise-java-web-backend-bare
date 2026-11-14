package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.menu.DefaultWebBackendMenuItem;
import dev.reuise.web.core.bare.menu.BareWebMenuItem;
import dev.reuise.web.core.bare.menu.BareWebMenuItemPart;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuItemPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractMenuItem<S extends AbstractMenuItem<S, O>, O extends AbstractMenuItemOptions<?>> extends DefaultWebBackendMenuItem<S, O> implements BareWebMenuItem , WebBackendComponentPart {
    protected final BareWebMenuItemPart barePart;

    protected AbstractMenuItem(O options) {
        super(options);
        barePart = new DefaultBareWebMenuItemPart(options);
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
