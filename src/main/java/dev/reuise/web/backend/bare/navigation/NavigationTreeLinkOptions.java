package dev.reuise.web.backend.bare.navigation;
import dev.reuise.web.backend.link.WebBackendNavigationLinkOptions;
public class NavigationTreeLinkOptions extends AbstractNavigationTreeLinkOptions<NavigationTreeLinkOptions> {
    public NavigationTreeLinkOptions() {
    }

    public NavigationTreeLinkOptions(WebBackendNavigationLinkOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected NavigationTreeLinkOptions self() {
        return this;
    }
}
