package dev.reuise.web.backend.bare.carousel;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class CarouselCardOptions extends AbstractCarouselCardOptions<CarouselCardOptions> {
    public CarouselCardOptions() {
    }

    public CarouselCardOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CarouselCardOptions self() {
        return this;
    }
}
