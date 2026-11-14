package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Container extends AbstractContainer<Container, ContainerOptions> {
    public Container() {
        this(createOptions());
    }

    public Container(ContainerOptions options) {
        super(options);
    }

    public static ContainerOptions createOptions() {
        return new ContainerOptions();
    }

    public static Container create(ContainerOptions options) {
        return new Container(options);
    }

    public static Container create(WebBackendParentComponentOptions options) {
        return create(new ContainerOptions(options));
    }

    public static Container create() {
        return new Container();
    }

    @Override
    protected Container self() {
        return this;
    }
}
