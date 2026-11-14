package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendTextOptions;
public class InlineText extends AbstractInlineText<InlineText, InlineTextOptions> {
    public InlineText() {
        this(createOptions());
    }

    public InlineText(InlineTextOptions options) {
        super(options);
    }

    public static InlineTextOptions createOptions() {
        return new InlineTextOptions();
    }

    public static InlineText create(InlineTextOptions options) {
        return new InlineText(options);
    }

    public static InlineText create(WebBackendTextOptions options) {
        return create(new InlineTextOptions(options));
    }

    public static InlineText create() {
        return new InlineText();
    }

    @Override
    protected InlineText self() {
        return this;
    }
}
