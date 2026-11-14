package dev.reuise.web.backend.bare.carousel;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.carousel.AbstractWebBackendCarouselOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.carousel.BareWebCarouselPartOptions;
import dev.reuise.web.core.bare.carousel.DefaultBareWebCarouselOptions;
public abstract class AbstractCarouselOptions<S extends AbstractCarouselOptions<S>> extends AbstractWebBackendCarouselOptions<S> implements BareWebCarouselPartOptions {
    protected final BareWebCarouselPartOptions barePart;

    protected AbstractCarouselOptions() {
        this(null);
    }

    protected AbstractCarouselOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCarouselOptions();
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
