package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendRotatingTextOptions;
import dev.reuise.web.core.bare.text.BareWebRotatingTextPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebRotatingTextOptions;
public abstract class AbstractRotatingTextOptions<S extends AbstractRotatingTextOptions<S>> extends AbstractWebBackendRotatingTextOptions<S> implements BareWebRotatingTextPartOptions {
    protected final BareWebRotatingTextPartOptions barePart;

    protected AbstractRotatingTextOptions() {
        this(null);
    }

    protected AbstractRotatingTextOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebRotatingTextOptions();
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
