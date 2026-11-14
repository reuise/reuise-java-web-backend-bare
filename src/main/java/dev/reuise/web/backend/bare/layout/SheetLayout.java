package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerOptions;
public class SheetLayout extends AbstractSheetLayout<SheetLayout, SheetLayoutOptions> {
    public SheetLayout() {
        this(createOptions());
    }

    public SheetLayout(SheetLayoutOptions options) {
        super(options);
    }

    public static SheetLayoutOptions createOptions() {
        return new SheetLayoutOptions();
    }

    public static SheetLayout create(SheetLayoutOptions options) {
        return new SheetLayout(options);
    }

    public static SheetLayout create(WebBackendSplitContainerOptions options) {
        return create(new SheetLayoutOptions(options));
    }

    public static SheetLayout create() {
        return new SheetLayout();
    }

    @Override
    protected SheetLayout self() {
        return this;
    }
}
