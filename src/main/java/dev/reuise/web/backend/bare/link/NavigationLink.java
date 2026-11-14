package dev.reuise.web.backend.bare.link;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
public class NavigationLink extends AbstractNavigationLink<NavigationLink, NavigationLinkOptions> {
    public NavigationLink() {
        this(createOptions());
    }

    public NavigationLink(NavigationLinkOptions options) {
        super(options);
    }

    public static NavigationLinkOptions createOptions() {
        return new NavigationLinkOptions();
    }

    public static NavigationLink create(NavigationLinkOptions options) {
        return new NavigationLink(options);
    }

    public static NavigationLink create(WebBackendLinkOptions options) {
        return create(new NavigationLinkOptions(options));
    }

    public static NavigationLink create() {
        return new NavigationLink();
    }

    @Override
    protected NavigationLink self() {
        return this;
    }
}
