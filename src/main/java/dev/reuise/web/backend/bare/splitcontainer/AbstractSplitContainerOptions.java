package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.splitcontainer.AbstractWebBackendSplitContainerOptions;
import dev.reuise.web.core.bare.splitcontainer.BareWebSplitContainerPartOptions;
import dev.reuise.web.core.bare.splitcontainer.DefaultBareWebSplitContainerOptions;
public abstract class AbstractSplitContainerOptions<S extends AbstractSplitContainerOptions<S>> extends AbstractWebBackendSplitContainerOptions<S> implements BareWebSplitContainerPartOptions {
    protected final BareWebSplitContainerPartOptions barePart;

    protected AbstractSplitContainerOptions() {
        this(null);
    }

    protected AbstractSplitContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSplitContainerOptions();
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
