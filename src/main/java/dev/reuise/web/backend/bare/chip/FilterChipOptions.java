package dev.reuise.web.backend.bare.chip;
import dev.reuise.web.backend.chip.WebBackendChipOptions;
public class FilterChipOptions extends AbstractFilterChipOptions<FilterChipOptions> {
    public FilterChipOptions() {
    }

    public FilterChipOptions(WebBackendChipOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected FilterChipOptions self() {
        return this;
    }
}
