package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class RouteLayoutOptions extends AbstractRouteLayoutOptions<RouteLayoutOptions> {
    public RouteLayoutOptions() {
    }

    public RouteLayoutOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected RouteLayoutOptions self() {
        return this;
    }
}
