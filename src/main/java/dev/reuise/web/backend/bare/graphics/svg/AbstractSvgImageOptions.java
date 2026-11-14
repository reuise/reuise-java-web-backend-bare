package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.graphics.svg.AbstractWebBackendSvgImageOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgImagePartOptions;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgImageOptions;
public abstract class AbstractSvgImageOptions<S extends AbstractSvgImageOptions<S>> extends AbstractWebBackendSvgImageOptions<S> implements BareWebSvgImagePartOptions {
    protected final BareWebSvgImagePartOptions barePart;

    protected AbstractSvgImageOptions() {
        this(null);
    }

    protected AbstractSvgImageOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSvgImageOptions();
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
