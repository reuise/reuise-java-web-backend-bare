package dev.reuise.web.backend.bare.navigation;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemOptions;
public class NavigationTreeGroupOptions extends AbstractNavigationTreeGroupOptions<NavigationTreeGroupOptions> {
    public NavigationTreeGroupOptions() {
    }

    public NavigationTreeGroupOptions(WebBackendAccordionItemOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected NavigationTreeGroupOptions self() {
        return this;
    }
}
