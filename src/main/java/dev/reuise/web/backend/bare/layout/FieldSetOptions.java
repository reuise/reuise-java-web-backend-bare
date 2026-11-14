package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class FieldSetOptions extends AbstractFieldSetOptions<FieldSetOptions> {
    public FieldSetOptions() {
    }

    public FieldSetOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected FieldSetOptions self() {
        return this;
    }
}
