package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.scrollablecontainer.AbstractWebBackendScrollableContainerOptions;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerPartOptions;
import dev.reuise.web.core.bare.scrollablecontainer.DefaultBareWebScrollableContainerOptions;
public abstract class AbstractScrollableContainerOptions<S extends AbstractScrollableContainerOptions<S>> extends AbstractWebBackendScrollableContainerOptions<S> implements BareWebScrollableContainerPartOptions {
    protected final BareWebScrollableContainerPartOptions barePart;

    protected AbstractScrollableContainerOptions() {
        this(null);
    }

    protected AbstractScrollableContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebScrollableContainerOptions();
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
