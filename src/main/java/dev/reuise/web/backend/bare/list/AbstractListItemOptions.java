package dev.reuise.web.backend.bare.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.list.AbstractWebBackendListItemOptions;
import dev.reuise.web.backend.list.WebBackendBasicListItemOptions;
import dev.reuise.web.core.bare.list.BareWebListItemPartOptions;
import dev.reuise.web.core.bare.list.DefaultBareWebListItemOptions;
public abstract class AbstractListItemOptions<S extends AbstractListItemOptions<S>> extends AbstractWebBackendListItemOptions<S> implements BareWebListItemPartOptions {
    protected final BareWebListItemPartOptions barePart;

    protected AbstractListItemOptions() {
        this(null);
    }

    protected AbstractListItemOptions(WebBackendBasicListItemOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebListItemOptions();
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
