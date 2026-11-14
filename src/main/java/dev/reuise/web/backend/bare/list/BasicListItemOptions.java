package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class BasicListItemOptions extends AbstractBasicListItemOptions<BasicListItemOptions> {
    public BasicListItemOptions() {
    }

    public BasicListItemOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected BasicListItemOptions self() {
        return this;
    }
}
