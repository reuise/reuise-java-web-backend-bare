package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TextField extends AbstractTextField<TextField, TextFieldOptions> {
    public TextField() {
        this(createOptions());
    }

    public TextField(TextFieldOptions options) {
        super(options);
    }

    public static TextFieldOptions createOptions() {
        return new TextFieldOptions();
    }

    public static TextField create(TextFieldOptions options) {
        return new TextField(options);
    }

    public static TextField create(WebBackendParentComponentOptions options) {
        return create(new TextFieldOptions(options));
    }

    public static TextField create() {
        return new TextField();
    }

    @Override
    protected TextField self() {
        return this;
    }
}
