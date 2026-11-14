package dev.reuise.web.backend.bare.chip;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Chip extends AbstractChip<Chip, ChipOptions> {
    public Chip() {
        this(createOptions());
    }

    public Chip(ChipOptions options) {
        super(options);
    }

    public static ChipOptions createOptions() {
        return new ChipOptions();
    }

    public static Chip create(ChipOptions options) {
        return new Chip(options);
    }

    public static Chip create(WebBackendParentComponentOptions options) {
        return create(new ChipOptions(options));
    }

    public static Chip create() {
        return new Chip();
    }

    @Override
    protected Chip self() {
        return this;
    }
}
