package dev.reuise.web.backend.bare.topappbar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.topappbar.AbstractWebBackendTopAppBarOptions;
import dev.reuise.web.core.bare.topappbar.BareWebTopAppBarPartOptions;
import dev.reuise.web.core.bare.topappbar.DefaultBareWebTopAppBarOptions;
public abstract class AbstractTopAppBarOptions<S extends AbstractTopAppBarOptions<S>> extends AbstractWebBackendTopAppBarOptions<S> implements BareWebTopAppBarPartOptions {
    protected final BareWebTopAppBarPartOptions barePart;

    protected AbstractTopAppBarOptions() {
        this(null);
    }

    protected AbstractTopAppBarOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTopAppBarOptions();
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
