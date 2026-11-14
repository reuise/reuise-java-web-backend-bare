package dev.reuise.web.backend.bare.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.list.AbstractWebBackendBasicListItemOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.list.BareWebBasicListItemPartOptions;
import dev.reuise.web.core.bare.list.DefaultBareWebBasicListItemOptions;
public abstract class AbstractBasicListItemOptions<S extends AbstractBasicListItemOptions<S>> extends AbstractWebBackendBasicListItemOptions<S> implements BareWebBasicListItemPartOptions {
    protected final BareWebBasicListItemPartOptions barePart;

    protected AbstractBasicListItemOptions() {
        this(null);
    }

    protected AbstractBasicListItemOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebBasicListItemOptions();
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
