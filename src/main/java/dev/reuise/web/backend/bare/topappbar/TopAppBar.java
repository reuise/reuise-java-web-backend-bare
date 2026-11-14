package dev.reuise.web.backend.bare.topappbar;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TopAppBar extends AbstractTopAppBar<TopAppBar, TopAppBarOptions> {
    public TopAppBar() {
        this(createOptions());
    }

    public TopAppBar(TopAppBarOptions options) {
        super(options);
    }

    public static TopAppBarOptions createOptions() {
        return new TopAppBarOptions();
    }

    public static TopAppBar create(TopAppBarOptions options) {
        return new TopAppBar(options);
    }

    public static TopAppBar create(WebBackendParentComponentOptions options) {
        return create(new TopAppBarOptions(options));
    }

    public static TopAppBar create() {
        return new TopAppBar();
    }

    @Override
    protected TopAppBar self() {
        return this;
    }
}
