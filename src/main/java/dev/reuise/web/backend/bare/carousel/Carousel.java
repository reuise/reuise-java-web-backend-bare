package dev.reuise.web.backend.bare.carousel;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class Carousel extends AbstractCarousel<Carousel, CarouselOptions> {
    public Carousel() {
        this(createOptions());
    }

    public Carousel(CarouselOptions options) {
        super(options);
    }

    public static CarouselOptions createOptions() {
        return new CarouselOptions();
    }

    public static Carousel create(CarouselOptions options) {
        return new Carousel(options);
    }

    public static Carousel create(WebBackendContainerOptions options) {
        return create(new CarouselOptions(options));
    }

    public static Carousel create() {
        return new Carousel();
    }

    @Override
    protected Carousel self() {
        return this;
    }
}
