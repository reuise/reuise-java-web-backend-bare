package dev.reuise.web.backend.bare.navigation;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.navigation.DefaultWebBackendNavigationTreeGroup;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreeGroup;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreeGroupPart;
import dev.reuise.web.core.bare.navigation.DefaultBareWebNavigationTreeGroupPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractNavigationTreeGroup<S extends AbstractNavigationTreeGroup<S, O>, O extends AbstractNavigationTreeGroupOptions<?>> extends DefaultWebBackendNavigationTreeGroup<S, O> implements WebBackendComponentPart , BareWebNavigationTreeGroup {
    protected final BareWebNavigationTreeGroupPart barePart;

    protected AbstractNavigationTreeGroup(O options) {
        super(options);
        barePart = new DefaultBareWebNavigationTreeGroupPart(options);
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
