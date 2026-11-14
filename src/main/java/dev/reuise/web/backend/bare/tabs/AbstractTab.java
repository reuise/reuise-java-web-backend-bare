package dev.reuise.web.backend.bare.tabs;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.tabs.DefaultWebBackendTab;
import dev.reuise.web.core.bare.tabs.BareWebTab;
import dev.reuise.web.core.bare.tabs.BareWebTabPart;
import dev.reuise.web.core.bare.tabs.DefaultBareWebTabPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTab<S extends AbstractTab<S, O>, O extends AbstractTabOptions<?>> extends DefaultWebBackendTab<S, O> implements BareWebTab , WebBackendComponentPart {
    protected final BareWebTabPart barePart;

    protected AbstractTab(O options) {
        super(options);
        barePart = new DefaultBareWebTabPart(options);
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
