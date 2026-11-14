package dev.reuise.web.backend.bare.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.table.AbstractWebBackendCheckboxTableCellOptions;
import dev.reuise.web.backend.table.WebBackendTableCellOptions;
import dev.reuise.web.core.bare.table.BareWebCheckboxTableCellPartOptions;
import dev.reuise.web.core.bare.table.DefaultBareWebCheckboxTableCellOptions;
public abstract class AbstractCheckboxTableCellOptions<S extends AbstractCheckboxTableCellOptions<S>> extends AbstractWebBackendCheckboxTableCellOptions<S> implements BareWebCheckboxTableCellPartOptions {
    protected final BareWebCheckboxTableCellPartOptions barePart;

    protected AbstractCheckboxTableCellOptions() {
        this(null);
    }

    protected AbstractCheckboxTableCellOptions(WebBackendTableCellOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCheckboxTableCellOptions();
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
