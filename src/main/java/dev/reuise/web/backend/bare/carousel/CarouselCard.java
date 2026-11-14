package dev.reuise.web.backend.bare.carousel;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class CarouselCard extends AbstractCarouselCard<CarouselCard, CarouselCardOptions> {
    public CarouselCard() {
        this(createOptions());
    }

    public CarouselCard(CarouselCardOptions options) {
        super(options);
    }

    public static CarouselCardOptions createOptions() {
        return new CarouselCardOptions();
    }

    public static CarouselCard create(CarouselCardOptions options) {
        return new CarouselCard(options);
    }

    public static CarouselCard create(WebBackendContainerOptions options) {
        return create(new CarouselCardOptions(options));
    }

    public static CarouselCard create() {
        return new CarouselCard();
    }

    @Override
    protected CarouselCard self() {
        return this;
    }
}
