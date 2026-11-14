package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.scrollablecontainer.AbstractWebBackendScrollableContainerEdgeOptions;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerEdgePartOptions;
import dev.reuise.web.core.bare.scrollablecontainer.DefaultBareWebScrollableContainerEdgeOptions;
public abstract class AbstractScrollableContainerEdgeOptions<S extends AbstractScrollableContainerEdgeOptions<S>> extends AbstractWebBackendScrollableContainerEdgeOptions<S> implements BareWebScrollableContainerEdgePartOptions {
    protected final BareWebScrollableContainerEdgePartOptions barePart;

    protected AbstractScrollableContainerEdgeOptions() {
        this(null);
    }

    protected AbstractScrollableContainerEdgeOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebScrollableContainerEdgeOptions();
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
