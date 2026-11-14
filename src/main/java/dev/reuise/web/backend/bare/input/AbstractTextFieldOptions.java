package dev.reuise.web.backend.bare.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.input.AbstractWebBackendTextFieldOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.input.BareWebTextFieldPartOptions;
import dev.reuise.web.core.bare.input.DefaultBareWebTextFieldOptions;
public abstract class AbstractTextFieldOptions<S extends AbstractTextFieldOptions<S>> extends AbstractWebBackendTextFieldOptions<S> implements BareWebTextFieldPartOptions {
    protected final BareWebTextFieldPartOptions barePart;

    protected AbstractTextFieldOptions() {
        this(null);
    }

    protected AbstractTextFieldOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTextFieldOptions();
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
