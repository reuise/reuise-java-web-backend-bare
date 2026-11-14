package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableColumnGroupOptions;
import dev.reuise.web.core.bare.table.BareWebTableColumnGroupPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableColumnGroupOptions;
public abstract class AbstractTableColumnGroupOptions<S extends AbstractTableColumnGroupOptions<S>> extends AbstractWebBackendTableColumnGroupOptions<S> implements BareWebTableColumnGroupPartOptions {
    protected final BareWebTableColumnGroupPartOptions barePart;

    protected AbstractTableColumnGroupOptions() {
        this(null);
    }

    protected AbstractTableColumnGroupOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableColumnGroupOptions();
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
