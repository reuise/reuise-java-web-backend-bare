package dev.reuise.web.backend.bare.chip;
import dev.reuise.web.backend.chip.WebBackendChipOptions;
public class FilterChip extends AbstractFilterChip<FilterChip, FilterChipOptions> {
    public FilterChip() {
        this(createOptions());
    }

    public FilterChip(FilterChipOptions options) {
        super(options);
    }

    public static FilterChipOptions createOptions() {
        return new FilterChipOptions();
    }

    public static FilterChip create(FilterChipOptions options) {
        return new FilterChip(options);
    }

    public static FilterChip create(WebBackendChipOptions options) {
        return create(new FilterChipOptions(options));
    }

    public static FilterChip create() {
        return new FilterChip();
    }

    @Override
    protected FilterChip self() {
        return this;
    }
}
