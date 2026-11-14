package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerOptions;
public class SheetLayoutOptions extends AbstractSheetLayoutOptions<SheetLayoutOptions> {
    public SheetLayoutOptions() {
    }

    public SheetLayoutOptions(WebBackendSplitContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SheetLayoutOptions self() {
        return this;
    }
}
