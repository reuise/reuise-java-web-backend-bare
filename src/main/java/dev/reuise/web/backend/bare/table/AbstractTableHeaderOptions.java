package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableHeaderOptions;
import dev.reuise.web.core.bare.table.BareWebTableHeaderPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableHeaderOptions;
public abstract class AbstractTableHeaderOptions<S extends AbstractTableHeaderOptions<S>> extends AbstractWebBackendTableHeaderOptions<S> implements BareWebTableHeaderPartOptions {
    protected final BareWebTableHeaderPartOptions barePart;

    protected AbstractTableHeaderOptions() {
        this(null);
    }

    protected AbstractTableHeaderOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableHeaderOptions();
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
