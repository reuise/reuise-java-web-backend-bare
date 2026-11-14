package dev.reuise.web.backend.bare.applayout;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class AppLayout extends AbstractAppLayout<AppLayout, AppLayoutOptions> {
    public AppLayout() {
        this(createOptions());
    }

    public AppLayout(AppLayoutOptions options) {
        super(options);
    }

    public static AppLayoutOptions createOptions() {
        return new AppLayoutOptions();
    }

    public static AppLayout create(AppLayoutOptions options) {
        return new AppLayout(options);
    }

    public static AppLayout create(WebBackendParentComponentOptions options) {
        return create(new AppLayoutOptions(options));
    }

    public static AppLayout create() {
        return new AppLayout();
    }

    @Override
    protected AppLayout self() {
        return this;
    }
}
