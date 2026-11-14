package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
public class ChipField extends AbstractChipField<ChipField, ChipFieldOptions> {
    public ChipField() {
        this(createOptions());
    }

    public ChipField(ChipFieldOptions options) {
        super(options);
    }

    public static ChipFieldOptions createOptions() {
        return new ChipFieldOptions();
    }

    public static ChipField create(ChipFieldOptions options) {
        return new ChipField(options);
    }

    public static ChipField create(WebBackendTextFieldOptions options) {
        return create(new ChipFieldOptions(options));
    }

    public static ChipField create() {
        return new ChipField();
    }

    @Override
    protected ChipField self() {
        return this;
    }
}
