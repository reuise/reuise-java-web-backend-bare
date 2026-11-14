package dev.reuise.web.backend.bare.bottomappbar;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class BottomAppBarOptions extends AbstractBottomAppBarOptions<BottomAppBarOptions> {
    public BottomAppBarOptions() {
    }

    public BottomAppBarOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected BottomAppBarOptions self() {
        return this;
    }
}
