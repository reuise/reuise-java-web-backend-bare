package dev.reuise.web.backend.bare.view;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.view.DefaultWebBackendSheetRouteLayout;
import dev.reuise.web.core.bare.view.BareWebSheetRouteLayout;
import dev.reuise.web.core.bare.view.BareWebSheetRouteLayoutPart;
import dev.reuise.web.core.bare.view.DefaultBareWebSheetRouteLayoutPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSheetRouteLayout<S extends AbstractSheetRouteLayout<S, O>, O extends AbstractSheetRouteLayoutOptions<?>> extends DefaultWebBackendSheetRouteLayout<S, O> implements BareWebSheetRouteLayout , WebBackendComponentPart {
    protected final BareWebSheetRouteLayoutPart barePart;

    protected AbstractSheetRouteLayout(O options) {
        super(options);
        barePart = new DefaultBareWebSheetRouteLayoutPart(options);
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
