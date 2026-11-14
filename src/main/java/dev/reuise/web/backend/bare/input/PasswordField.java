package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
public class PasswordField extends AbstractPasswordField<PasswordField, PasswordFieldOptions> {
    public PasswordField() {
        this(createOptions());
    }

    public PasswordField(PasswordFieldOptions options) {
        super(options);
    }

    public static PasswordFieldOptions createOptions() {
        return new PasswordFieldOptions();
    }

    public static PasswordField create(PasswordFieldOptions options) {
        return new PasswordField(options);
    }

    public static PasswordField create(WebBackendTextFieldOptions options) {
        return create(new PasswordFieldOptions(options));
    }

    public static PasswordField create() {
        return new PasswordField();
    }

    @Override
    protected PasswordField self() {
        return this;
    }
}
