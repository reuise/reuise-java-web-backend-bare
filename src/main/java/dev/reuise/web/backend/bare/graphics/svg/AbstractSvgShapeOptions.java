package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.graphics.svg.AbstractWebBackendSvgShapeOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgShapePartOptions;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgShapeOptions;
public abstract class AbstractSvgShapeOptions<S extends AbstractSvgShapeOptions<S>> extends AbstractWebBackendSvgShapeOptions<S> implements BareWebSvgShapePartOptions {
    protected final BareWebSvgShapePartOptions barePart;

    protected AbstractSvgShapeOptions() {
        this(null);
    }

    protected AbstractSvgShapeOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSvgShapeOptions();
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
