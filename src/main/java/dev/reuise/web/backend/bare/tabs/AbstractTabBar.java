package dev.reuise.web.backend.bare.tabs;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.tabs.DefaultWebBackendTabBar;
import dev.reuise.web.core.bare.tabs.BareWebTabBar;
import dev.reuise.web.core.bare.tabs.BareWebTabBarPart;
import dev.reuise.web.core.bare.tabs.DefaultBareWebTabBarPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTabBar<S extends AbstractTabBar<S, O>, O extends AbstractTabBarOptions<?>> extends DefaultWebBackendTabBar<S, O> implements WebBackendComponentPart , BareWebTabBar {
    protected final BareWebTabBarPart barePart;

    protected AbstractTabBar(O options) {
        super(options);
        barePart = new DefaultBareWebTabBarPart(options);
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
