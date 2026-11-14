package dev.reuise.web.backend.bare.applayout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.applayout.AbstractWebBackendAppLayoutBodyOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.applayout.BareWebAppLayoutBodyPartOptions;
import dev.reuise.web.core.bare.applayout.DefaultBareWebAppLayoutBodyOptions;
public abstract class AbstractAppLayoutBodyOptions<S extends AbstractAppLayoutBodyOptions<S>> extends AbstractWebBackendAppLayoutBodyOptions<S> implements BareWebAppLayoutBodyPartOptions {
    protected final BareWebAppLayoutBodyPartOptions barePart;

    protected AbstractAppLayoutBodyOptions() {
        this(null);
    }

    protected AbstractAppLayoutBodyOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebAppLayoutBodyOptions();
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
