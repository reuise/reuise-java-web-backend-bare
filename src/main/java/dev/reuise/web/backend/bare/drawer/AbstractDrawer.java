package dev.reuise.web.backend.bare.drawer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.drawer.DefaultWebBackendDrawer;
import dev.reuise.web.core.bare.drawer.BareWebDrawer;
import dev.reuise.web.core.bare.drawer.BareWebDrawerPart;
import dev.reuise.web.core.bare.drawer.DefaultBareWebDrawerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractDrawer<S extends AbstractDrawer<S, O>, O extends AbstractDrawerOptions<?>> extends DefaultWebBackendDrawer<S, O> implements WebBackendComponentPart , BareWebDrawer {
    protected final BareWebDrawerPart barePart;

    protected AbstractDrawer(O options) {
        super(options);
        barePart = new DefaultBareWebDrawerPart(options);
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
