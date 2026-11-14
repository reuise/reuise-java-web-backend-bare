package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableCellOptions;
import dev.reuise.web.core.bare.table.BareWebTableCellPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableCellOptions;
public abstract class AbstractTableCellOptions<S extends AbstractTableCellOptions<S>> extends AbstractWebBackendTableCellOptions<S> implements BareWebTableCellPartOptions {
    protected final BareWebTableCellPartOptions barePart;

    protected AbstractTableCellOptions() {
        this(null);
    }

    protected AbstractTableCellOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableCellOptions();
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
