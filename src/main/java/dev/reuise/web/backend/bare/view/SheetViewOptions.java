package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.view.WebBackendViewOptions;
public class SheetViewOptions extends AbstractSheetViewOptions<SheetViewOptions> {
    public SheetViewOptions() {
    }

    public SheetViewOptions(WebBackendViewOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SheetViewOptions self() {
        return this;
    }
}
