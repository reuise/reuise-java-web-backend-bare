package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableColumnOptions;
import dev.reuise.web.core.bare.table.BareWebTableColumnPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableColumnOptions;
public abstract class AbstractTableColumnOptions<S extends AbstractTableColumnOptions<S>> extends AbstractWebBackendTableColumnOptions<S> implements BareWebTableColumnPartOptions {
    protected final BareWebTableColumnPartOptions barePart;

    protected AbstractTableColumnOptions() {
        this(null);
    }

    protected AbstractTableColumnOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableColumnOptions();
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
