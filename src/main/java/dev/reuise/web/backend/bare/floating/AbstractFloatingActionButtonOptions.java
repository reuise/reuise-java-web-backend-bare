package dev.reuise.web.backend.bare.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.floating.AbstractWebBackendFloatingActionButtonOptions;
import dev.reuise.web.core.bare.floating.BareWebFloatingActionButtonPartOptions;
import dev.reuise.web.core.bare.floating.DefaultBareWebFloatingActionButtonOptions;
public abstract class AbstractFloatingActionButtonOptions<S extends AbstractFloatingActionButtonOptions<S>> extends AbstractWebBackendFloatingActionButtonOptions<S> implements BareWebFloatingActionButtonPartOptions {
    protected final BareWebFloatingActionButtonPartOptions barePart;

    protected AbstractFloatingActionButtonOptions() {
        this(null);
    }

    protected AbstractFloatingActionButtonOptions(WebBackendButtonOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebFloatingActionButtonOptions();
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
