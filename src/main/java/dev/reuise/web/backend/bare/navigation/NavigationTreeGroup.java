package dev.reuise.web.backend.bare.navigation;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemOptions;
public class NavigationTreeGroup extends AbstractNavigationTreeGroup<NavigationTreeGroup, NavigationTreeGroupOptions> {
    public NavigationTreeGroup() {
        this(createOptions());
    }

    public NavigationTreeGroup(NavigationTreeGroupOptions options) {
        super(options);
    }

    public static NavigationTreeGroupOptions createOptions() {
        return new NavigationTreeGroupOptions();
    }

    public static NavigationTreeGroup create(NavigationTreeGroupOptions options) {
        return new NavigationTreeGroup(options);
    }

    public static NavigationTreeGroup create(WebBackendAccordionItemOptions options) {
        return create(new NavigationTreeGroupOptions(options));
    }

    public static NavigationTreeGroup create() {
        return new NavigationTreeGroup();
    }

    @Override
    protected NavigationTreeGroup self() {
        return this;
    }
}
