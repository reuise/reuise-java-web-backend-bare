package dev.reuise.web.backend.bare.navigation;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.navigation.DefaultWebBackendNavigationTree;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTree;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreePart;
import dev.reuise.web.core.bare.navigation.DefaultBareWebNavigationTreePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractNavigationTree<S extends AbstractNavigationTree<S, O>, O extends AbstractNavigationTreeOptions<?>> extends DefaultWebBackendNavigationTree<S, O> implements BareWebNavigationTree , WebBackendComponentPart {
    protected final BareWebNavigationTreePart barePart;

    protected AbstractNavigationTree(O options) {
        super(options);
        barePart = new DefaultBareWebNavigationTreePart(options);
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
