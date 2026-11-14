package dev.reuise.web.backend.bare.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.input.AbstractWebBackendMultiEmailAddressFieldOptions;
import dev.reuise.web.backend.input.WebBackendChipFieldOptions;
import dev.reuise.web.core.bare.input.BareWebMultiEmailAddressFieldPartOptions;
import dev.reuise.web.core.bare.input.DefaultBareWebMultiEmailAddressFieldOptions;
public abstract class AbstractMultiEmailAddressFieldOptions<S extends AbstractMultiEmailAddressFieldOptions<S>> extends AbstractWebBackendMultiEmailAddressFieldOptions<S> implements BareWebMultiEmailAddressFieldPartOptions {
    protected final BareWebMultiEmailAddressFieldPartOptions barePart;

    protected AbstractMultiEmailAddressFieldOptions() {
        this(null);
    }

    protected AbstractMultiEmailAddressFieldOptions(WebBackendChipFieldOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMultiEmailAddressFieldOptions();
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
