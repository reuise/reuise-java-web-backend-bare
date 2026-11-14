package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ContainerOptions extends AbstractContainerOptions<ContainerOptions> {
    public ContainerOptions() {
    }

    public ContainerOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ContainerOptions self() {
        return this;
    }
}
