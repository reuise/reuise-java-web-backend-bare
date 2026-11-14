package dev.reuise.web.backend.bare.carousel;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.carousel.DefaultWebBackendCarousel;
import dev.reuise.web.core.bare.carousel.BareWebCarousel;
import dev.reuise.web.core.bare.carousel.BareWebCarouselPart;
import dev.reuise.web.core.bare.carousel.DefaultBareWebCarouselPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCarousel<S extends AbstractCarousel<S, O>, O extends AbstractCarouselOptions<?>> extends DefaultWebBackendCarousel<S, O> implements BareWebCarousel , WebBackendComponentPart {
    protected final BareWebCarouselPart barePart;

    protected AbstractCarousel(O options) {
        super(options);
        barePart = new DefaultBareWebCarouselPart(options);
        if (options == null)
            return;

        // addPart(ComponentPart.Type.DESIGN, barePart)
        initialize(self(), options);
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}
