package dev.reuise.web.backend.bare.chip;
import dev.reuise.web.backend.layout.WebBackendFieldSetOptions;
public class ChipGroupOptions extends AbstractChipGroupOptions<ChipGroupOptions> {
    public ChipGroupOptions() {
    }

    public ChipGroupOptions(WebBackendFieldSetOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ChipGroupOptions self() {
        return this;
    }
}
