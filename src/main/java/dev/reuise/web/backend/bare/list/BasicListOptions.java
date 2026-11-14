package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class BasicListOptions extends AbstractBasicListOptions<BasicListOptions> {
    public BasicListOptions() {
    }

    public BasicListOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected BasicListOptions self() {
        return this;
    }
}
