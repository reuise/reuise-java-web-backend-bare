package dev.reuise.web.backend.bare.menu;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.menu.DefaultWebBackendMenuButtonItem;
import dev.reuise.web.core.bare.menu.BareWebMenuButtonItem;
import dev.reuise.web.core.bare.menu.BareWebMenuButtonItemPart;
import dev.reuise.web.core.bare.menu.DefaultBareWebMenuButtonItemPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractMenuButtonItem<S extends AbstractMenuButtonItem<S, O>, O extends AbstractMenuButtonItemOptions<?>> extends DefaultWebBackendMenuButtonItem<S, O> implements BareWebMenuButtonItem , WebBackendComponentPart {
    protected final BareWebMenuButtonItemPart barePart;

    protected AbstractMenuButtonItem(O options) {
        super(options);
        barePart = new DefaultBareWebMenuButtonItemPart(options);
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
