package dev.reuise.web.backend.bare.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.input.AbstractWebBackendBasicInputFieldOptions;
import dev.reuise.web.core.bare.input.BareWebBasicInputFieldPartOptions;
import dev.reuise.web.core.bare.input.DefaultBareWebBasicInputFieldOptions;
public abstract class AbstractBasicInputFieldOptions<S extends AbstractBasicInputFieldOptions<S>> extends AbstractWebBackendBasicInputFieldOptions<S> implements BareWebBasicInputFieldPartOptions {
    protected final BareWebBasicInputFieldPartOptions barePart;

    protected AbstractBasicInputFieldOptions() {
        this(null);
    }

    protected AbstractBasicInputFieldOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebBasicInputFieldOptions();
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
