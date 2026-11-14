package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.AbstractWebBackendFieldSetOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.layout.BareWebFieldSetPartOptions;
import dev.reuise.web.core.bare.layout.DefaultBareWebFieldSetOptions;
public abstract class AbstractFieldSetOptions<S extends AbstractFieldSetOptions<S>> extends AbstractWebBackendFieldSetOptions<S> implements BareWebFieldSetPartOptions {
    protected final BareWebFieldSetPartOptions barePart;

    protected AbstractFieldSetOptions() {
        this(null);
    }

    protected AbstractFieldSetOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebFieldSetOptions();
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
