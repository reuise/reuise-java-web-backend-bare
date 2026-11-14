package dev.reuise.web.backend.bare.carousel;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.carousel.AbstractWebBackendCarouselCardOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.carousel.BareWebCarouselCardPartOptions;
import dev.reuise.web.core.bare.carousel.DefaultBareWebCarouselCardOptions;
public abstract class AbstractCarouselCardOptions<S extends AbstractCarouselCardOptions<S>> extends AbstractWebBackendCarouselCardOptions<S> implements BareWebCarouselCardPartOptions {
    protected final BareWebCarouselCardPartOptions barePart;

    protected AbstractCarouselCardOptions() {
        this(null);
    }

    protected AbstractCarouselCardOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCarouselCardOptions();
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
