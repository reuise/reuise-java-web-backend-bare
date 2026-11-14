package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class RouteLayout extends AbstractRouteLayout<RouteLayout, RouteLayoutOptions> {
    public RouteLayout() {
        this(createOptions());
    }

    public RouteLayout(RouteLayoutOptions options) {
        super(options);
    }

    public static RouteLayoutOptions createOptions() {
        return new RouteLayoutOptions();
    }

    public static RouteLayout create(RouteLayoutOptions options) {
        return new RouteLayout(options);
    }

    public static RouteLayout create(WebBackendContainerOptions options) {
        return create(new RouteLayoutOptions(options));
    }

    public static RouteLayout create() {
        return new RouteLayout();
    }

    @Override
    protected RouteLayout self() {
        return this;
    }
}
