package dev.reuise.web.backend.bare.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.button.AbstractWebBackendButtonBarOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.button.BareWebButtonBarPartOptions;
import dev.reuise.web.core.bare.button.DefaultBareWebButtonBarOptions;
public abstract class AbstractButtonBarOptions<S extends AbstractButtonBarOptions<S>> extends AbstractWebBackendButtonBarOptions<S> implements BareWebButtonBarPartOptions {
    protected final BareWebButtonBarPartOptions barePart;

    protected AbstractButtonBarOptions() {
        this(null);
    }

    protected AbstractButtonBarOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebButtonBarOptions();
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
