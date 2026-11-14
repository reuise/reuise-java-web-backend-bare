package dev.reuise.web.backend.bare.tabs;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Tab extends AbstractTab<Tab, TabOptions> {
    public Tab() {
        this(createOptions());
    }

    public Tab(TabOptions options) {
        super(options);
    }

    public static TabOptions createOptions() {
        return new TabOptions();
    }

    public static Tab create(TabOptions options) {
        return new Tab(options);
    }

    public static Tab create(WebBackendParentComponentOptions options) {
        return create(new TabOptions(options));
    }

    public static Tab create() {
        return new Tab();
    }

    @Override
    protected Tab self() {
        return this;
    }
}
