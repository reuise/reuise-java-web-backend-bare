package dev.reuise.web.backend.bare.checkbox;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Checkbox extends AbstractCheckbox<Checkbox, CheckboxOptions> {
    public Checkbox() {
        this(createOptions());
    }

    public Checkbox(CheckboxOptions options) {
        super(options);
    }

    public static CheckboxOptions createOptions() {
        return new CheckboxOptions();
    }

    public static Checkbox create(CheckboxOptions options) {
        return new Checkbox(options);
    }

    public static Checkbox create(WebBackendParentComponentOptions options) {
        return create(new CheckboxOptions(options));
    }

    public static Checkbox create() {
        return new Checkbox();
    }

    @Override
    protected Checkbox self() {
        return this;
    }
}
