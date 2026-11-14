package dev.reuise.web.backend.bare.topappbar;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TopAppBarOptions extends AbstractTopAppBarOptions<TopAppBarOptions> {
    public TopAppBarOptions() {
    }

    public TopAppBarOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TopAppBarOptions self() {
        return this;
    }
}
