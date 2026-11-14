package dev.reuise.web.backend.bare.scriptcomponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.scriptcomponent.AbstractWebBackendScriptComponentOptions;
import dev.reuise.web.core.bare.scriptcomponent.BareWebScriptComponentPartOptions;
import dev.reuise.web.core.bare.scriptcomponent.DefaultBareWebScriptComponentOptions;
public abstract class AbstractScriptComponentOptions<S extends AbstractScriptComponentOptions<S>> extends AbstractWebBackendScriptComponentOptions<S> implements BareWebScriptComponentPartOptions {
    protected final BareWebScriptComponentPartOptions barePart;

    protected AbstractScriptComponentOptions() {
        this(null);
    }

    protected AbstractScriptComponentOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebScriptComponentOptions();
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
