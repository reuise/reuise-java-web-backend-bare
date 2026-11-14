package dev.reuise.web.backend.bare.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.view.AbstractWebBackendViewOptions;
import dev.reuise.web.core.bare.view.BareWebViewPartOptions;
import dev.reuise.web.core.bare.view.DefaultBareWebViewOptions;
public abstract class AbstractViewOptions<S extends AbstractViewOptions<S>> extends AbstractWebBackendViewOptions<S> implements BareWebViewPartOptions {
    protected final BareWebViewPartOptions barePart;

    protected AbstractViewOptions() {
        this(null);
    }

    protected AbstractViewOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebViewOptions();
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
