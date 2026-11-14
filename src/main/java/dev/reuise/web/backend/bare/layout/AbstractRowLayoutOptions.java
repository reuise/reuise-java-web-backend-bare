package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.AbstractWebBackendRowLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.layout.BareWebRowLayoutPartOptions;
import dev.reuise.web.core.bare.layout.DefaultBareWebRowLayoutOptions;
public abstract class AbstractRowLayoutOptions<S extends AbstractRowLayoutOptions<S>> extends AbstractWebBackendRowLayoutOptions<S> implements BareWebRowLayoutPartOptions {
    protected final BareWebRowLayoutPartOptions barePart;

    protected AbstractRowLayoutOptions() {
        this(null);
    }

    protected AbstractRowLayoutOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebRowLayoutOptions();
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
