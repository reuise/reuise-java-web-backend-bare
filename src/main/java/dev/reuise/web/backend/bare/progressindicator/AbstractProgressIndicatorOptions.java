package dev.reuise.web.backend.bare.progressindicator;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.progressindicator.AbstractWebBackendProgressIndicatorOptions;
import dev.reuise.web.core.bare.progressindicator.BareWebProgressIndicatorPartOptions;
import dev.reuise.web.core.bare.progressindicator.DefaultBareWebProgressIndicatorOptions;
public abstract class AbstractProgressIndicatorOptions<S extends AbstractProgressIndicatorOptions<S>> extends AbstractWebBackendProgressIndicatorOptions<S> implements BareWebProgressIndicatorPartOptions {
    protected final BareWebProgressIndicatorPartOptions barePart;

    protected AbstractProgressIndicatorOptions() {
        this(null);
    }

    protected AbstractProgressIndicatorOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebProgressIndicatorOptions();
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
