package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.graphics.svg.AbstractWebBackendSvgPathOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgPathPartOptions;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgPathOptions;
public abstract class AbstractSvgPathOptions<S extends AbstractSvgPathOptions<S>> extends AbstractWebBackendSvgPathOptions<S> implements BareWebSvgPathPartOptions {
    protected final BareWebSvgPathPartOptions barePart;

    protected AbstractSvgPathOptions() {
        this(null);
    }

    protected AbstractSvgPathOptions(WebBackendSvgShapeOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSvgPathOptions();
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
