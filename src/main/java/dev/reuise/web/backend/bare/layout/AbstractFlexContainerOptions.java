package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.AbstractWebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.layout.BareWebFlexContainerPartOptions;
import dev.reuise.web.core.bare.layout.DefaultBareWebFlexContainerOptions;
public abstract class AbstractFlexContainerOptions<S extends AbstractFlexContainerOptions<S>> extends AbstractWebBackendFlexContainerOptions<S> implements BareWebFlexContainerPartOptions {
    protected final BareWebFlexContainerPartOptions barePart;

    protected AbstractFlexContainerOptions() {
        this(null);
    }

    protected AbstractFlexContainerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebFlexContainerOptions();
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
