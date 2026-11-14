package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendTextOptions;
public class TextBlock extends AbstractTextBlock<TextBlock, TextBlockOptions> {
    public TextBlock() {
        this(createOptions());
    }

    public TextBlock(TextBlockOptions options) {
        super(options);
    }

    public static TextBlockOptions createOptions() {
        return new TextBlockOptions();
    }

    public static TextBlock create(TextBlockOptions options) {
        return new TextBlock(options);
    }

    public static TextBlock create(WebBackendTextOptions options) {
        return create(new TextBlockOptions(options));
    }

    public static TextBlock create() {
        return new TextBlock();
    }

    @Override
    protected TextBlock self() {
        return this;
    }
}
