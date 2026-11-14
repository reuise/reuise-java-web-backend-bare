package dev.reuise.web.backend.bare.list;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.list.DefaultWebBackendListView;
import dev.reuise.web.core.bare.list.BareWebListView;
import dev.reuise.web.core.bare.list.BareWebListViewPart;
import dev.reuise.web.core.bare.list.DefaultBareWebListViewPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractListView<S extends AbstractListView<S, O>, O extends AbstractListViewOptions<?>> extends DefaultWebBackendListView<S, O> implements WebBackendComponentPart , BareWebListView {
    protected final BareWebListViewPart barePart;

    protected AbstractListView(O options) {
        super(options);
        barePart = new DefaultBareWebListViewPart(options);
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
