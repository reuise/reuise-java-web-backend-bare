package dev.reuise.web.backend.bare.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.list.AbstractWebBackendBasicListOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.list.BareWebBasicListPartOptions;
import dev.reuise.web.core.bare.list.DefaultBareWebBasicListOptions;
public abstract class AbstractBasicListOptions<S extends AbstractBasicListOptions<S>> extends AbstractWebBackendBasicListOptions<S> implements BareWebBasicListPartOptions {
    protected final BareWebBasicListPartOptions barePart;

    protected AbstractBasicListOptions() {
        this(null);
    }

    protected AbstractBasicListOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebBasicListOptions();
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
