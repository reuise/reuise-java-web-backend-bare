package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.checkbox.AbstractWebBackendCheckboxOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.checkbox.BareWebCheckboxPartOptions;
import dev.reuise.web.core.bare.checkbox.DefaultBareWebCheckboxOptions;
public abstract class AbstractCheckboxOptions<S extends AbstractCheckboxOptions<S>> extends AbstractWebBackendCheckboxOptions<S> implements BareWebCheckboxPartOptions {
    protected final BareWebCheckboxPartOptions barePart;

    protected AbstractCheckboxOptions() {
        this(null);
    }

    protected AbstractCheckboxOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCheckboxOptions();
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
