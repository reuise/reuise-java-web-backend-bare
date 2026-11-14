package dev.reuise.web.backend.bare.card;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class CardGridOptions extends AbstractCardGridOptions<CardGridOptions> {
    public CardGridOptions() {
    }

    public CardGridOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CardGridOptions self() {
        return this;
    }
}
