package dev.reuise.web.backend.bare.card;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class CardGrid extends AbstractCardGrid<CardGrid, CardGridOptions> {
    public CardGrid() {
        this(createOptions());
    }

    public CardGrid(CardGridOptions options) {
        super(options);
    }

    public static CardGridOptions createOptions() {
        return new CardGridOptions();
    }

    public static CardGrid create(CardGridOptions options) {
        return new CardGrid(options);
    }

    public static CardGrid create(WebBackendContainerOptions options) {
        return create(new CardGridOptions(options));
    }

    public static CardGrid create() {
        return new CardGrid();
    }

    @Override
    protected CardGrid self() {
        return this;
    }
}
