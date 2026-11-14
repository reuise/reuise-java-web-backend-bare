package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class FieldSet extends AbstractFieldSet<FieldSet, FieldSetOptions> {
    public FieldSet() {
        this(createOptions());
    }

    public FieldSet(FieldSetOptions options) {
        super(options);
    }

    public static FieldSetOptions createOptions() {
        return new FieldSetOptions();
    }

    public static FieldSet create(FieldSetOptions options) {
        return new FieldSet(options);
    }

    public static FieldSet create(WebBackendContainerOptions options) {
        return create(new FieldSetOptions(options));
    }

    public static FieldSet create() {
        return new FieldSet();
    }

    @Override
    protected FieldSet self() {
        return this;
    }
}
