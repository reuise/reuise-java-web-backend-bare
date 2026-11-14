package dev.reuise.web.backend.bare.navigation;
import dev.reuise.web.backend.link.WebBackendNavigationLinkOptions;
public class NavigationTreeLink extends AbstractNavigationTreeLink<NavigationTreeLink, NavigationTreeLinkOptions> {
    public NavigationTreeLink() {
        this(createOptions());
    }

    public NavigationTreeLink(NavigationTreeLinkOptions options) {
        super(options);
    }

    public static NavigationTreeLinkOptions createOptions() {
        return new NavigationTreeLinkOptions();
    }

    public static NavigationTreeLink create(NavigationTreeLinkOptions options) {
        return new NavigationTreeLink(options);
    }

    public static NavigationTreeLink create(WebBackendNavigationLinkOptions options) {
        return create(new NavigationTreeLinkOptions(options));
    }

    public static NavigationTreeLink create() {
        return new NavigationTreeLink();
    }

    @Override
    protected NavigationTreeLink self() {
        return this;
    }
}
