package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutOptions;
public class SheetRouteLayout extends AbstractSheetRouteLayout<SheetRouteLayout, SheetRouteLayoutOptions> {
    public SheetRouteLayout() {
        this(createOptions());
    }

    public SheetRouteLayout(SheetRouteLayoutOptions options) {
        super(options);
    }

    public static SheetRouteLayoutOptions createOptions() {
        return new SheetRouteLayoutOptions();
    }

    public static SheetRouteLayout create(SheetRouteLayoutOptions options) {
        return new SheetRouteLayout(options);
    }

    public static SheetRouteLayout create(WebBackendSheetLayoutOptions options) {
        return create(new SheetRouteLayoutOptions(options));
    }

    public static SheetRouteLayout create() {
        return new SheetRouteLayout();
    }

    @Override
    protected SheetRouteLayout self() {
        return this;
    }
}
