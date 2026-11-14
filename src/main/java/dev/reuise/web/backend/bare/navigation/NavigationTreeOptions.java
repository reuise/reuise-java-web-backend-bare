package dev.reuise.web.backend.bare.navigation;
import dev.reuise.web.backend.accordion.WebBackendAccordionOptions;
public class NavigationTreeOptions extends AbstractNavigationTreeOptions<NavigationTreeOptions> {
    public NavigationTreeOptions() {
    }

    public NavigationTreeOptions(WebBackendAccordionOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected NavigationTreeOptions self() {
        return this;
    }
}
