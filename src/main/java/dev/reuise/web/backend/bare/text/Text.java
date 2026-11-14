package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Text extends AbstractText<Text, TextOptions> {
    public Text() {
        this(createOptions());
    }

    public Text(TextOptions options) {
        super(options);
    }

    public static TextOptions createOptions() {
        return new TextOptions();
    }

    public static Text create(TextOptions options) {
        return new Text(options);
    }

    public static Text create(WebBackendParentComponentOptions options) {
        return create(new TextOptions(options));
    }

    public static Text create() {
        return new Text();
    }

    @Override
    protected Text self() {
        return this;
    }
}
