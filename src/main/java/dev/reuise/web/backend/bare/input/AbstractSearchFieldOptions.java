package dev.reuise.web.backend.bare.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.input.AbstractWebBackendSearchFieldOptions;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
import dev.reuise.web.core.bare.input.BareWebSearchFieldPartOptions;
import dev.reuise.web.core.bare.input.DefaultBareWebSearchFieldOptions;
public abstract class AbstractSearchFieldOptions<S extends AbstractSearchFieldOptions<S>> extends AbstractWebBackendSearchFieldOptions<S> implements BareWebSearchFieldPartOptions {
    protected final BareWebSearchFieldPartOptions barePart;

    protected AbstractSearchFieldOptions() {
        this(null);
    }

    protected AbstractSearchFieldOptions(WebBackendTextFieldOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSearchFieldOptions();
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
