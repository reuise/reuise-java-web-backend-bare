package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendTextOptions;
public class TextBlockOptions extends AbstractTextBlockOptions<TextBlockOptions> {
    public TextBlockOptions() {
    }

    public TextBlockOptions(WebBackendTextOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TextBlockOptions self() {
        return this;
    }
}
