package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendChipFieldOptions;
public class MultiEmailAddressFieldOptions extends AbstractMultiEmailAddressFieldOptions<MultiEmailAddressFieldOptions> {
    public MultiEmailAddressFieldOptions() {
    }

    public MultiEmailAddressFieldOptions(WebBackendChipFieldOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MultiEmailAddressFieldOptions self() {
        return this;
    }
}
