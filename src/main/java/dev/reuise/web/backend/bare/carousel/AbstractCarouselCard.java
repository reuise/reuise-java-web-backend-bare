package dev.reuise.web.backend.bare.carousel;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.carousel.DefaultWebBackendCarouselCard;
import dev.reuise.web.core.bare.carousel.BareWebCarouselCard;
import dev.reuise.web.core.bare.carousel.BareWebCarouselCardPart;
import dev.reuise.web.core.bare.carousel.DefaultBareWebCarouselCardPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCarouselCard<S extends AbstractCarouselCard<S, O>, O extends AbstractCarouselCardOptions<?>> extends DefaultWebBackendCarouselCard<S, O> implements BareWebCarouselCard , WebBackendComponentPart {
    protected final BareWebCarouselCardPart barePart;

    protected AbstractCarouselCard(O options) {
        super(options);
        barePart = new DefaultBareWebCarouselCardPart(options);
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
