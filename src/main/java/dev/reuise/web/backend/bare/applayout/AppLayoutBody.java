package dev.reuise.web.backend.bare.applayout;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class AppLayoutBody extends AbstractAppLayoutBody<AppLayoutBody, AppLayoutBodyOptions> {
    public AppLayoutBody() {
        this(createOptions());
    }

    public AppLayoutBody(AppLayoutBodyOptions options) {
        super(options);
    }

    public static AppLayoutBodyOptions createOptions() {
        return new AppLayoutBodyOptions();
    }

    public static AppLayoutBody create(AppLayoutBodyOptions options) {
        return new AppLayoutBody(options);
    }

    public static AppLayoutBody create(WebBackendFlexContainerOptions options) {
        return create(new AppLayoutBodyOptions(options));
    }

    public static AppLayoutBody create() {
        return new AppLayoutBody();
    }

    @Override
    protected AppLayoutBody self() {
        return this;
    }
}
