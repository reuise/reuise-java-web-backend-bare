package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableBodyOptions;
import dev.reuise.web.core.bare.table.BareWebTableBodyPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableBodyOptions;
public abstract class AbstractTableBodyOptions<S extends AbstractTableBodyOptions<S>> extends AbstractWebBackendTableBodyOptions<S> implements BareWebTableBodyPartOptions {
    protected final BareWebTableBodyPartOptions barePart;

    protected AbstractTableBodyOptions() {
        this(null);
    }

    protected AbstractTableBodyOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableBodyOptions();
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
