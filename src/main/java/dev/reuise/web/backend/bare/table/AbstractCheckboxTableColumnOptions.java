package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendCheckboxTableColumnOptions;
import dev.reuise.web.backend.table.WebBackendTableColumnOptions;
import dev.reuise.web.core.bare.table.BareWebCheckboxTableColumnPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebCheckboxTableColumnOptions;
public abstract class AbstractCheckboxTableColumnOptions<S extends AbstractCheckboxTableColumnOptions<S>> extends AbstractWebBackendCheckboxTableColumnOptions<S> implements BareWebCheckboxTableColumnPartOptions {
    protected final BareWebCheckboxTableColumnPartOptions barePart;

    protected AbstractCheckboxTableColumnOptions() {
        this(null);
    }

    protected AbstractCheckboxTableColumnOptions(WebBackendTableColumnOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCheckboxTableColumnOptions();
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
