package dev.reuise.web.backend.bare.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.input.AbstractWebBackendPasswordFieldOptions;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
import dev.reuise.web.core.bare.input.BareWebPasswordFieldPartOptions;
import dev.reuise.web.core.bare.input.DefaultBareWebPasswordFieldOptions;
public abstract class AbstractPasswordFieldOptions<S extends AbstractPasswordFieldOptions<S>> extends AbstractWebBackendPasswordFieldOptions<S> implements BareWebPasswordFieldPartOptions {
    protected final BareWebPasswordFieldPartOptions barePart;

    protected AbstractPasswordFieldOptions() {
        this(null);
    }

    protected AbstractPasswordFieldOptions(WebBackendTextFieldOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebPasswordFieldOptions();
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
