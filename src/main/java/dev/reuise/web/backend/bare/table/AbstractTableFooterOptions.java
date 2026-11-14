package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendTableFooterOptions;
import dev.reuise.web.core.bare.table.BareWebTableFooterPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebTableFooterOptions;
public abstract class AbstractTableFooterOptions<S extends AbstractTableFooterOptions<S>> extends AbstractWebBackendTableFooterOptions<S> implements BareWebTableFooterPartOptions {
    protected final BareWebTableFooterPartOptions barePart;

    protected AbstractTableFooterOptions() {
        this(null);
    }

    protected AbstractTableFooterOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTableFooterOptions();
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
