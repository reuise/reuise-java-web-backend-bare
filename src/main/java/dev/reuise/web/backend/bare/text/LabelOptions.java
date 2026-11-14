package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
public class LabelOptions extends AbstractLabelOptions<LabelOptions> {
    public LabelOptions() {
    }

    public LabelOptions(WebBackendInlineTextOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected LabelOptions self() {
        return this;
    }
}
