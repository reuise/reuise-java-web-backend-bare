package dev.reuise.web.backend.bare.tabs;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class TabBar extends AbstractTabBar<TabBar, TabBarOptions> {
    public TabBar() {
        this(createOptions());
    }

    public TabBar(TabBarOptions options) {
        super(options);
    }

    public static TabBarOptions createOptions() {
        return new TabBarOptions();
    }

    public static TabBar create(TabBarOptions options) {
        return new TabBar(options);
    }

    public static TabBar create(WebBackendContainerOptions options) {
        return create(new TabBarOptions(options));
    }

    public static TabBar create() {
        return new TabBar();
    }

    @Override
    protected TabBar self() {
        return this;
    }
}
