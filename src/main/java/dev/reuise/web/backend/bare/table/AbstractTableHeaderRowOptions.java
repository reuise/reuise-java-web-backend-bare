package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableHeaderRowOptions;
import dev.reuise.web.core.bare.table.BareWebTableHeaderRowPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableHeaderRowOptions;
public abstract class AbstractTableHeaderRowOptions<S extends AbstractTableHeaderRowOptions<S>> extends AbstractWebBackendTableHeaderRowOptions<S> implements BareWebTableHeaderRowPartOptions {
    protected final BareWebTableHeaderRowPartOptions barePart;

    protected AbstractTableHeaderRowOptions() {
        this(null);
    }

    protected AbstractTableHeaderRowOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableHeaderRowOptions();
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
