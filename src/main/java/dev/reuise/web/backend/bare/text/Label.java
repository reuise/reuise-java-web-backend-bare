package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
public class Label extends AbstractLabel<Label, LabelOptions> {
    public Label() {
        this(createOptions());
    }

    public Label(LabelOptions options) {
        super(options);
    }

    public static LabelOptions createOptions() {
        return new LabelOptions();
    }

    public static Label create(LabelOptions options) {
        return new Label(options);
    }

    public static Label create(WebBackendInlineTextOptions options) {
        return create(new LabelOptions(options));
    }

    public static Label create() {
        return new Label();
    }

    @Override
    protected Label self() {
        return this;
    }
}
