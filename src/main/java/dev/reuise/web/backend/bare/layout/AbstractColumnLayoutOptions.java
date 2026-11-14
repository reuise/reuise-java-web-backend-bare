package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.AbstractWebBackendColumnLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.layout.BareWebColumnLayoutPartOptions;
import dev.reuise.web.core.bare.layout.DefaultBareWebColumnLayoutOptions;
public abstract class AbstractColumnLayoutOptions<S extends AbstractColumnLayoutOptions<S>> extends AbstractWebBackendColumnLayoutOptions<S> implements BareWebColumnLayoutPartOptions {
    protected final BareWebColumnLayoutPartOptions barePart;

    protected AbstractColumnLayoutOptions() {
        this(null);
    }

    protected AbstractColumnLayoutOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebColumnLayoutOptions();
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
