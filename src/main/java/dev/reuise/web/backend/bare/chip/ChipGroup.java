package dev.reuise.web.backend.bare.chip;
import dev.reuise.web.backend.layout.WebBackendFieldSetOptions;
public class ChipGroup extends AbstractChipGroup<ChipGroup, ChipGroupOptions> {
    public ChipGroup() {
        this(createOptions());
    }

    public ChipGroup(ChipGroupOptions options) {
        super(options);
    }

    public static ChipGroupOptions createOptions() {
        return new ChipGroupOptions();
    }

    public static ChipGroup create(ChipGroupOptions options) {
        return new ChipGroup(options);
    }

    public static ChipGroup create(WebBackendFieldSetOptions options) {
        return create(new ChipGroupOptions(options));
    }

    public static ChipGroup create() {
        return new ChipGroup();
    }

    @Override
    protected ChipGroup self() {
        return this;
    }
}
