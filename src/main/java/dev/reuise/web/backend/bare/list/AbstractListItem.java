package dev.reuise.web.backend.bare.list;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.list.DefaultWebBackendListItem;
import dev.reuise.web.core.bare.list.BareWebListItem;
import dev.reuise.web.core.bare.list.BareWebListItemPart;
import dev.reuise.web.core.bare.list.DefaultBareWebListItemPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractListItem<S extends AbstractListItem<S, O>, O extends AbstractListItemOptions<?>> extends DefaultWebBackendListItem<S, O> implements WebBackendComponentPart , BareWebListItem {
    protected final BareWebListItemPart barePart;

    protected AbstractListItem(O options) {
        super(options);
        barePart = new DefaultBareWebListItemPart(options);
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
