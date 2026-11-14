package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
public class PasswordFieldOptions extends AbstractPasswordFieldOptions<PasswordFieldOptions> {
    public PasswordFieldOptions() {
    }

    public PasswordFieldOptions(WebBackendTextFieldOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected PasswordFieldOptions self() {
        return this;
    }
}
