package dev.reuise.web.backend.bare.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutOptions;
import dev.reuise.web.backend.view.AbstractWebBackendSheetRouteLayoutOptions;
import dev.reuise.web.core.bare.view.BareWebSheetRouteLayoutPartOptions;
import dev.reuise.web.core.bare.view.DefaultBareWebSheetRouteLayoutOptions;
public abstract class AbstractSheetRouteLayoutOptions<S extends AbstractSheetRouteLayoutOptions<S>> extends AbstractWebBackendSheetRouteLayoutOptions<S> implements BareWebSheetRouteLayoutPartOptions {
    protected final BareWebSheetRouteLayoutPartOptions barePart;

    protected AbstractSheetRouteLayoutOptions() {
        this(null);
    }

    protected AbstractSheetRouteLayoutOptions(WebBackendSheetLayoutOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSheetRouteLayoutOptions();
        ((BaseComponentOptions) (getBaseComponentPart())).initialize(this);
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    public WebBackendComponentFactory getComponentFactory() {
        return DefaultComponentFactory.get();
    }
}
