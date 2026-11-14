package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.view.WebBackendViewOptions;
public class SheetView extends AbstractSheetView<SheetView, SheetViewOptions> {
    public SheetView() {
        this(createOptions());
    }

    public SheetView(SheetViewOptions options) {
        super(options);
    }

    public static SheetViewOptions createOptions() {
        return new SheetViewOptions();
    }

    public static SheetView create(SheetViewOptions options) {
        return new SheetView(options);
    }

    public static SheetView create(WebBackendViewOptions options) {
        return create(new SheetViewOptions(options));
    }

    public static SheetView create() {
        return new SheetView();
    }

    @Override
    protected SheetView self() {
        return this;
    }
}
