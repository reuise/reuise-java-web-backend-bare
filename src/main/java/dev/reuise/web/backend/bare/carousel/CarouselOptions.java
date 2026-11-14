package dev.reuise.web.backend.bare.carousel;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class CarouselOptions extends AbstractCarouselOptions<CarouselOptions> {
    public CarouselOptions() {
    }

    public CarouselOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CarouselOptions self() {
        return this;
    }
}
