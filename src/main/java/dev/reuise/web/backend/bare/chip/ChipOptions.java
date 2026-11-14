package dev.reuise.web.backend.bare.chip;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ChipOptions extends AbstractChipOptions<ChipOptions> {
    public ChipOptions() {
    }

    public ChipOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ChipOptions self() {
        return this;
    }
}
