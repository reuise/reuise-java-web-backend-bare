package dev.reuise.web.backend.bare.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.button.AbstractWebBackendButtonOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.button.BareWebButtonPartOptions;
import dev.reuise.web.core.bare.button.DefaultBareWebButtonOptions;
public abstract class AbstractButtonOptions<S extends AbstractButtonOptions<S>> extends AbstractWebBackendButtonOptions<S> implements BareWebButtonPartOptions {
    protected final BareWebButtonPartOptions barePart;

    protected AbstractButtonOptions() {
        this(null);
    }

    protected AbstractButtonOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebButtonOptions();
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
