package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableRowOptions;
import dev.reuise.web.core.bare.table.BareWebTableRowPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableRowOptions;
public abstract class AbstractTableRowOptions<S extends AbstractTableRowOptions<S>> extends AbstractWebBackendTableRowOptions<S> implements BareWebTableRowPartOptions {
    protected final BareWebTableRowPartOptions barePart;

    protected AbstractTableRowOptions() {
        this(null);
    }

    protected AbstractTableRowOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableRowOptions();
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
