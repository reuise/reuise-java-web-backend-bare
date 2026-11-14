package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.slidecontainer.AbstractWebBackendSlideContainerEdgeOptions;
import dev.reuise.web.core.bare.slidecontainer.BareWebSlideContainerEdgePartOptions;
import dev.reuise.web.core.bare.slidecontainer.DefaultBareWebSlideContainerEdgeOptions;
public abstract class AbstractSlideContainerEdgeOptions<S extends AbstractSlideContainerEdgeOptions<S>> extends AbstractWebBackendSlideContainerEdgeOptions<S> implements BareWebSlideContainerEdgePartOptions {
    protected final BareWebSlideContainerEdgePartOptions barePart;

    protected AbstractSlideContainerEdgeOptions() {
        this(null);
    }

    protected AbstractSlideContainerEdgeOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSlideContainerEdgeOptions();
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
