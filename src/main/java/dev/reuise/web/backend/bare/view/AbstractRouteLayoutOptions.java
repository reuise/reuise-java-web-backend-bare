package dev.reuise.web.backend.bare.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.view.AbstractWebBackendRouteLayoutOptions;
import dev.reuise.web.core.bare.view.BareWebRouteLayoutPartOptions;
import dev.reuise.web.core.bare.view.DefaultBareWebRouteLayoutOptions;
public abstract class AbstractRouteLayoutOptions<S extends AbstractRouteLayoutOptions<S>> extends AbstractWebBackendRouteLayoutOptions<S> implements BareWebRouteLayoutPartOptions {
    protected final BareWebRouteLayoutPartOptions barePart;

    protected AbstractRouteLayoutOptions() {
        this(null);
    }

    protected AbstractRouteLayoutOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebRouteLayoutOptions();
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
