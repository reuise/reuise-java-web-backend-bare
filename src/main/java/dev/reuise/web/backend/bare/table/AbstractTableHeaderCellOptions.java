package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableHeaderCellOptions;
import dev.reuise.web.core.bare.table.BareWebTableHeaderCellPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableHeaderCellOptions;
public abstract class AbstractTableHeaderCellOptions<S extends AbstractTableHeaderCellOptions<S>> extends AbstractWebBackendTableHeaderCellOptions<S> implements BareWebTableHeaderCellPartOptions {
    protected final BareWebTableHeaderCellPartOptions barePart;

    protected AbstractTableHeaderCellOptions() {
        this(null);
    }

    protected AbstractTableHeaderCellOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableHeaderCellOptions();
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
