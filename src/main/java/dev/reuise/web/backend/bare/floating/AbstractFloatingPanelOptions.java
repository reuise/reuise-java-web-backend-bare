package dev.reuise.web.backend.bare.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.floating.AbstractWebBackendFloatingPanelOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.floating.BareWebFloatingPanelPartOptions;
import dev.reuise.web.core.bare.floating.DefaultBareWebFloatingPanelOptions;
public abstract class AbstractFloatingPanelOptions<S extends AbstractFloatingPanelOptions<S>> extends AbstractWebBackendFloatingPanelOptions<S> implements BareWebFloatingPanelPartOptions {
    protected final BareWebFloatingPanelPartOptions barePart;

    protected AbstractFloatingPanelOptions() {
        this(null);
    }

    protected AbstractFloatingPanelOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebFloatingPanelOptions();
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
