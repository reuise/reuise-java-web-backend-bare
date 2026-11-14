package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendChipFieldOptions;
public class MultiEmailAddressField extends AbstractMultiEmailAddressField<MultiEmailAddressField, MultiEmailAddressFieldOptions> {
    public MultiEmailAddressField() {
        this(createOptions());
    }

    public MultiEmailAddressField(MultiEmailAddressFieldOptions options) {
        super(options);
    }

    public static MultiEmailAddressFieldOptions createOptions() {
        return new MultiEmailAddressFieldOptions();
    }

    public static MultiEmailAddressField create(MultiEmailAddressFieldOptions options) {
        return new MultiEmailAddressField(options);
    }

    public static MultiEmailAddressField create(WebBackendChipFieldOptions options) {
        return create(new MultiEmailAddressFieldOptions(options));
    }

    public static MultiEmailAddressField create() {
        return new MultiEmailAddressField();
    }

    @Override
    protected MultiEmailAddressField self() {
        return this;
    }
}
