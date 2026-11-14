package dev.reuise.web.backend.bare.tabs;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class TabBarOptions extends AbstractTabBarOptions<TabBarOptions> {
    public TabBarOptions() {
    }

    public TabBarOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TabBarOptions self() {
        return this;
    }
}
