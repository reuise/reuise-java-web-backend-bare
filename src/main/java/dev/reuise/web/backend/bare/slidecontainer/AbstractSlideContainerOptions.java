package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.slidecontainer.AbstractWebBackendSlideContainerOptions;
import dev.reuise.web.core.bare.slidecontainer.BareWebSlideContainerPartOptions;
import dev.reuise.web.core.bare.slidecontainer.DefaultBareWebSlideContainerOptions;
public abstract class AbstractSlideContainerOptions<S extends AbstractSlideContainerOptions<S>> extends AbstractWebBackendSlideContainerOptions<S> implements BareWebSlideContainerPartOptions {
    protected final BareWebSlideContainerPartOptions barePart;

    protected AbstractSlideContainerOptions() {
        this(null);
    }

    protected AbstractSlideContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSlideContainerOptions();
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
