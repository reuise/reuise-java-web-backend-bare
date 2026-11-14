package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class BasicInputField extends AbstractBasicInputField<BasicInputField, BasicInputFieldOptions> {
    public BasicInputField() {
        this(createOptions());
    }

    public BasicInputField(BasicInputFieldOptions options) {
        super(options);
    }

    public static BasicInputFieldOptions createOptions() {
        return new BasicInputFieldOptions();
    }

    public static BasicInputField create(BasicInputFieldOptions options) {
        return new BasicInputField(options);
    }

    public static BasicInputField create(WebBackendBaseComponentOptions options) {
        return create(new BasicInputFieldOptions(options));
    }

    public static BasicInputField create() {
        return new BasicInputField();
    }

    @Override
    protected BasicInputField self() {
        return this;
    }
}
