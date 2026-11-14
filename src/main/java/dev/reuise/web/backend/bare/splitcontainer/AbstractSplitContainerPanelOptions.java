package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.splitcontainer.AbstractWebBackendSplitContainerPanelOptions;
import dev.reuise.web.core.bare.splitcontainer.BareWebSplitContainerPanelPartOptions;
import dev.reuise.web.core.bare.splitcontainer.DefaultBareWebSplitContainerPanelOptions;
public abstract class AbstractSplitContainerPanelOptions<S extends AbstractSplitContainerPanelOptions<S>> extends AbstractWebBackendSplitContainerPanelOptions<S> implements BareWebSplitContainerPanelPartOptions {
    protected final BareWebSplitContainerPanelPartOptions barePart;

    protected AbstractSplitContainerPanelOptions() {
        this(null);
    }

    protected AbstractSplitContainerPanelOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSplitContainerPanelOptions();
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
