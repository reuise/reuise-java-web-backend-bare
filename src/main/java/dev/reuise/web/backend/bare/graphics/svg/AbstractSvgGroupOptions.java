package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.graphics.svg.AbstractWebBackendSvgGroupOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgGroupPartOptions;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgGroupOptions;
public abstract class AbstractSvgGroupOptions<S extends AbstractSvgGroupOptions<S>> extends AbstractWebBackendSvgGroupOptions<S> implements BareWebSvgGroupPartOptions {
    protected final BareWebSvgGroupPartOptions barePart;

    protected AbstractSvgGroupOptions() {
        this(null);
    }

    protected AbstractSvgGroupOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSvgGroupOptions();
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
