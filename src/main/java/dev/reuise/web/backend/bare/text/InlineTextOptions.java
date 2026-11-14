package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendTextOptions;
public class InlineTextOptions extends AbstractInlineTextOptions<InlineTextOptions> {
    public InlineTextOptions() {
    }

    public InlineTextOptions(WebBackendTextOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected InlineTextOptions self() {
        return this;
    }
}
