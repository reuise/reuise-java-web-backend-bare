package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TextFieldOptions extends AbstractTextFieldOptions<TextFieldOptions> {
    public TextFieldOptions() {
    }

    public TextFieldOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TextFieldOptions self() {
        return this;
    }
}
