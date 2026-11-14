package dev.reuise.web.backend.bare.card;
import dev.reuise.web.backend.layout.WebBackendSurfaceOptions;
public class CardOptions extends AbstractCardOptions<CardOptions> {
    public CardOptions() {
    }

    public CardOptions(WebBackendSurfaceOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CardOptions self() {
        return this;
    }
}
