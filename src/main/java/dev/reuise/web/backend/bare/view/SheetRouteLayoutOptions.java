package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutOptions;
public class SheetRouteLayoutOptions extends AbstractSheetRouteLayoutOptions<SheetRouteLayoutOptions> {
    public SheetRouteLayoutOptions() {
    }

    public SheetRouteLayoutOptions(WebBackendSheetLayoutOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SheetRouteLayoutOptions self() {
        return this;
    }
}
