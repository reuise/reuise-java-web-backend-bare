package dev.reuise.web.backend.bare.parentcomponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class ParentComponent extends AbstractParentComponent<ParentComponent, ParentComponentOptions> {
    public ParentComponent() {
        this(createOptions());
    }

    public ParentComponent(ParentComponentOptions options) {
        super(options);
    }

    public static ParentComponentOptions createOptions() {
        return new ParentComponentOptions();
    }

    public static ParentComponent create(ParentComponentOptions options) {
        return new ParentComponent(options);
    }

    public static ParentComponent create(WebBackendBaseComponentOptions options) {
        return create(new ParentComponentOptions(options));
    }

    public static ParentComponent create() {
        return new ParentComponent();
    }

    @Override
    protected ParentComponent self() {
        return this;
    }
}
