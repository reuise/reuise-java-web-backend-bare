package dev.reuise.web.backend.bare.link;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
public class NavigationLinkOptions extends AbstractNavigationLinkOptions<NavigationLinkOptions> {
    public NavigationLinkOptions() {
    }

    public NavigationLinkOptions(WebBackendLinkOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected NavigationLinkOptions self() {
        return this;
    }
}
