package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class BasicCheckbox extends AbstractBasicCheckbox<BasicCheckbox, BasicCheckboxOptions> {
    public BasicCheckbox() {
        this(createOptions());
    }

    public BasicCheckbox(BasicCheckboxOptions options) {
        super(options);
    }

    public static BasicCheckboxOptions createOptions() {
        return new BasicCheckboxOptions();
    }

    public static BasicCheckbox create(BasicCheckboxOptions options) {
        return new BasicCheckbox(options);
    }

    public static BasicCheckbox create(WebBackendBaseComponentOptions options) {
        return create(new BasicCheckboxOptions(options));
    }

    public static BasicCheckbox create() {
        return new BasicCheckbox();
    }

    @Override
    protected BasicCheckbox self() {
        return this;
    }
}
