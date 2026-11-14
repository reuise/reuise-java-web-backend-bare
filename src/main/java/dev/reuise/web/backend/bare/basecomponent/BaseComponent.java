package dev.reuise.web.backend.bare.basecomponent;
public class BaseComponent extends AbstractBaseComponent<BaseComponent, BaseComponentOptions> {
    public BaseComponent() {
        this(createOptions());
    }

    public BaseComponent(BaseComponentOptions options) {
        super(options);
    }

    public static BaseComponentOptions createOptions() {
        return new BaseComponentOptions();
    }

    public static BaseComponent create(BaseComponentOptions options) {
        return new BaseComponent(options);
    }

    public static BaseComponent create() {
        return new BaseComponent();
    }

    @Override
    protected BaseComponent self() {
        return this;
    }
}
