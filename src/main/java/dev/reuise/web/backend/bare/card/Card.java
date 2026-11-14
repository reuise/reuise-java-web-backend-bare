package dev.reuise.web.backend.bare.card;
import dev.reuise.web.backend.layout.WebBackendSurfaceOptions;
public class Card extends AbstractCard<Card, CardOptions> {
    public Card() {
        this(createOptions());
    }

    public Card(CardOptions options) {
        super(options);
    }

    public static CardOptions createOptions() {
        return new CardOptions();
    }

    public static Card create(CardOptions options) {
        return new Card(options);
    }

    public static Card create(WebBackendSurfaceOptions options) {
        return create(new CardOptions(options));
    }

    public static Card create() {
        return new Card();
    }

    @Override
    protected Card self() {
        return this;
    }
}
