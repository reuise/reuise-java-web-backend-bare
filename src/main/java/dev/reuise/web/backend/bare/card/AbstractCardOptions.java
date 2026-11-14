package dev.reuise.web.backend.bare.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.card.AbstractWebBackendCardOptions;
import dev.reuise.web.backend.layout.WebBackendSurfaceOptions;
import dev.reuise.web.core.bare.card.BareWebCardPartOptions;
import dev.reuise.web.core.bare.card.DefaultBareWebCardOptions;
public abstract class AbstractCardOptions<S extends AbstractCardOptions<S>> extends AbstractWebBackendCardOptions<S> implements BareWebCardPartOptions {
    protected final BareWebCardPartOptions barePart;

    protected AbstractCardOptions() {
        this(null);
    }

    protected AbstractCardOptions(WebBackendSurfaceOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCardOptions();
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
