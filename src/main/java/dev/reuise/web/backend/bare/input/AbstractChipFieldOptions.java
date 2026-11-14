package dev.reuise.web.backend.bare.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.input.AbstractWebBackendChipFieldOptions;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
import dev.reuise.web.core.bare.input.BareWebChipFieldPartOptions;
import dev.reuise.web.core.bare.input.DefaultBareWebChipFieldOptions;
public abstract class AbstractChipFieldOptions<S extends AbstractChipFieldOptions<S>> extends AbstractWebBackendChipFieldOptions<S> implements BareWebChipFieldPartOptions {
    protected final BareWebChipFieldPartOptions barePart;

    protected AbstractChipFieldOptions() {
        this(null);
    }

    protected AbstractChipFieldOptions(WebBackendTextFieldOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebChipFieldOptions();
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
