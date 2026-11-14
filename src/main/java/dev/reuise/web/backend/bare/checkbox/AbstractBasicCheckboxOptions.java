package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.checkbox.AbstractWebBackendBasicCheckboxOptions;
import dev.reuise.web.core.bare.checkbox.BareWebBasicCheckboxPartOptions;
import dev.reuise.web.core.bare.checkbox.DefaultBareWebBasicCheckboxOptions;
public abstract class AbstractBasicCheckboxOptions<S extends AbstractBasicCheckboxOptions<S>> extends AbstractWebBackendBasicCheckboxOptions<S> implements BareWebBasicCheckboxPartOptions {
    protected final BareWebBasicCheckboxPartOptions barePart;

    protected AbstractBasicCheckboxOptions() {
        this(null);
    }

    protected AbstractBasicCheckboxOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebBasicCheckboxOptions();
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
