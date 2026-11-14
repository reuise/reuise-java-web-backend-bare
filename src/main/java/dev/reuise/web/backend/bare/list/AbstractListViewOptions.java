package dev.reuise.web.backend.bare.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.list.AbstractWebBackendListViewOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.list.BareWebListViewPartOptions;
import dev.reuise.web.core.bare.list.DefaultBareWebListViewOptions;
public abstract class AbstractListViewOptions<S extends AbstractListViewOptions<S>> extends AbstractWebBackendListViewOptions<S> implements BareWebListViewPartOptions {
    protected final BareWebListViewPartOptions barePart;

    protected AbstractListViewOptions() {
        this(null);
    }

    protected AbstractListViewOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebListViewOptions();
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
