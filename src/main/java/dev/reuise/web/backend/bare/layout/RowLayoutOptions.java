package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class RowLayoutOptions extends AbstractRowLayoutOptions<RowLayoutOptions> {
    public RowLayoutOptions() {
    }

    public RowLayoutOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected RowLayoutOptions self() {
        return this;
    }
}
