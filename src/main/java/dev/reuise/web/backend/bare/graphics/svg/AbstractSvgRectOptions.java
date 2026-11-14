package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.graphics.svg.AbstractWebBackendSvgRectOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgRectPartOptions;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgRectOptions;
public abstract class AbstractSvgRectOptions<S extends AbstractSvgRectOptions<S>> extends AbstractWebBackendSvgRectOptions<S> implements BareWebSvgRectPartOptions {
    protected final BareWebSvgRectPartOptions barePart;

    protected AbstractSvgRectOptions() {
        this(null);
    }

    protected AbstractSvgRectOptions(WebBackendSvgShapeOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSvgRectOptions();
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
