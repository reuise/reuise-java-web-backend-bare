package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class ColumnLayout extends AbstractColumnLayout<ColumnLayout, ColumnLayoutOptions> {
    public ColumnLayout() {
        this(createOptions());
    }

    public ColumnLayout(ColumnLayoutOptions options) {
        super(options);
    }

    public static ColumnLayoutOptions createOptions() {
        return new ColumnLayoutOptions();
    }

    public static ColumnLayout create(ColumnLayoutOptions options) {
        return new ColumnLayout(options);
    }

    public static ColumnLayout create(WebBackendFlexContainerOptions options) {
        return create(new ColumnLayoutOptions(options));
    }

    public static ColumnLayout create() {
        return new ColumnLayout();
    }

    @Override
    protected ColumnLayout self() {
        return this;
    }
}
