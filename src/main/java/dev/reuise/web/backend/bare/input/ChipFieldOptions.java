package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
public class ChipFieldOptions extends AbstractChipFieldOptions<ChipFieldOptions> {
    public ChipFieldOptions() {
    }

    public ChipFieldOptions(WebBackendTextFieldOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ChipFieldOptions self() {
        return this;
    }
}
