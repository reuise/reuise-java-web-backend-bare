package dev.reuise.web.backend.bare.image;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.image.AbstractWebBackendImageOptions;
import dev.reuise.web.core.bare.image.BareWebImagePartOptions;
import dev.reuise.web.core.bare.image.DefaultBareWebImageOptions;
public abstract class AbstractImageOptions<S extends AbstractImageOptions<S>> extends AbstractWebBackendImageOptions<S> implements BareWebImagePartOptions {
    protected final BareWebImagePartOptions barePart;

    protected AbstractImageOptions() {
        this(null);
    }

    protected AbstractImageOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebImageOptions();
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
