package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.layout.WebBackendRowLayoutOptions;
public class SegmentedTextFieldOptions extends AbstractSegmentedTextFieldOptions<SegmentedTextFieldOptions> {
    public SegmentedTextFieldOptions() {
    }

    public SegmentedTextFieldOptions(WebBackendRowLayoutOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SegmentedTextFieldOptions self() {
        return this;
    }
}
