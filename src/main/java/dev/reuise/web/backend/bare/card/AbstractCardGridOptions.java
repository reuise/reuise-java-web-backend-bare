package dev.reuise.web.backend.bare.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.card.AbstractWebBackendCardGridOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.card.BareWebCardGridPartOptions;
import dev.reuise.web.core.bare.card.DefaultBareWebCardGridOptions;
public abstract class AbstractCardGridOptions<S extends AbstractCardGridOptions<S>> extends AbstractWebBackendCardGridOptions<S> implements BareWebCardGridPartOptions {
    protected final BareWebCardGridPartOptions barePart;

    protected AbstractCardGridOptions() {
        this(null);
    }

    protected AbstractCardGridOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCardGridOptions();
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
