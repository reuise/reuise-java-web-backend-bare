package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.layout.WebBackendRowLayoutOptions;
public class SegmentedTextField extends AbstractSegmentedTextField<SegmentedTextField, SegmentedTextFieldOptions> {
    public SegmentedTextField() {
        this(createOptions());
    }

    public SegmentedTextField(SegmentedTextFieldOptions options) {
        super(options);
    }

    public static SegmentedTextFieldOptions createOptions() {
        return new SegmentedTextFieldOptions();
    }

    public static SegmentedTextField create(SegmentedTextFieldOptions options) {
        return new SegmentedTextField(options);
    }

    public static SegmentedTextField create(WebBackendRowLayoutOptions options) {
        return create(new SegmentedTextFieldOptions(options));
    }

    public static SegmentedTextField create() {
        return new SegmentedTextField();
    }

    @Override
    protected SegmentedTextField self() {
        return this;
    }
}
