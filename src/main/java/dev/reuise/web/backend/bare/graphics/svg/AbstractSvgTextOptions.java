package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.graphics.svg.AbstractWebBackendSvgTextOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgTextPartOptions;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgTextOptions;
public abstract class AbstractSvgTextOptions<S extends AbstractSvgTextOptions<S>> extends AbstractWebBackendSvgTextOptions<S> implements BareWebSvgTextPartOptions {
    protected final BareWebSvgTextPartOptions barePart;

    protected AbstractSvgTextOptions() {
        this(null);
    }

    protected AbstractSvgTextOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSvgTextOptions();
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
