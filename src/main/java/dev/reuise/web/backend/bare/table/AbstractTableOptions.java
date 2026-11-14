package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableOptions;
import dev.reuise.web.core.bare.table.BareWebTablePartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableOptions;
public abstract class AbstractTableOptions<S extends AbstractTableOptions<S>> extends AbstractWebBackendTableOptions<S> implements BareWebTablePartOptions {
    protected final BareWebTablePartOptions barePart;

    protected AbstractTableOptions() {
        this(null);
    }

    protected AbstractTableOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableOptions();
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
