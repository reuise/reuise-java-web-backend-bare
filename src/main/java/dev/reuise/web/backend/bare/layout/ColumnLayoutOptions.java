package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class ColumnLayoutOptions extends AbstractColumnLayoutOptions<ColumnLayoutOptions> {
    public ColumnLayoutOptions() {
    }

    public ColumnLayoutOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ColumnLayoutOptions self() {
        return this;
    }
}
