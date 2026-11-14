package dev.reuise.web.backend.bare.layout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class RowLayout extends AbstractRowLayout<RowLayout, RowLayoutOptions> {
    public RowLayout() {
        this(createOptions());
    }

    public RowLayout(RowLayoutOptions options) {
        super(options);
    }

    public static RowLayoutOptions createOptions() {
        return new RowLayoutOptions();
    }

    public static RowLayout create(RowLayoutOptions options) {
        return new RowLayout(options);
    }

    public static RowLayout create(WebBackendFlexContainerOptions options) {
        return create(new RowLayoutOptions(options));
    }

    public static RowLayout create() {
        return new RowLayout();
    }

    @Override
    protected RowLayout self() {
        return this;
    }
}
