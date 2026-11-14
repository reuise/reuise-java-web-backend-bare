package dev.reuise.web.backend.bare.view;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.view.DefaultWebBackendRouteLayout;
import dev.reuise.web.core.bare.view.BareWebRouteLayout;
import dev.reuise.web.core.bare.view.BareWebRouteLayoutPart;
import dev.reuise.web.core.bare.view.DefaultBareWebRouteLayoutPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractRouteLayout<S extends AbstractRouteLayout<S, O>, O extends AbstractRouteLayoutOptions<?>> extends DefaultWebBackendRouteLayout<S, O> implements BareWebRouteLayout , WebBackendComponentPart {
    protected final BareWebRouteLayoutPart barePart;

    protected AbstractRouteLayout(O options) {
        super(options);
        barePart = new DefaultBareWebRouteLayoutPart(options);
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
