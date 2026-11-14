package dev.reuise.web.backend.bare.bottomappbar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.bottomappbar.AbstractWebBackendBottomAppBarOptions;
import dev.reuise.web.core.bare.bottomappbar.BareWebBottomAppBarPartOptions;
import dev.reuise.web.core.bare.bottomappbar.DefaultBareWebBottomAppBarOptions;
public abstract class AbstractBottomAppBarOptions<S extends AbstractBottomAppBarOptions<S>> extends AbstractWebBackendBottomAppBarOptions<S> implements BareWebBottomAppBarPartOptions {
    protected final BareWebBottomAppBarPartOptions barePart;

    protected AbstractBottomAppBarOptions() {
        this(null);
    }

    protected AbstractBottomAppBarOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebBottomAppBarOptions();
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
