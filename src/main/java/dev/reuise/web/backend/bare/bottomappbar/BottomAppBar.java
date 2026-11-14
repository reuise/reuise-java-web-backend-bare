package dev.reuise.web.backend.bare.bottomappbar;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class BottomAppBar extends AbstractBottomAppBar<BottomAppBar, BottomAppBarOptions> {
    public BottomAppBar() {
        this(createOptions());
    }

    public BottomAppBar(BottomAppBarOptions options) {
        super(options);
    }

    public static BottomAppBarOptions createOptions() {
        return new BottomAppBarOptions();
    }

    public static BottomAppBar create(BottomAppBarOptions options) {
        return new BottomAppBar(options);
    }

    public static BottomAppBar create(WebBackendBaseComponentOptions options) {
        return create(new BottomAppBarOptions(options));
    }

    public static BottomAppBar create() {
        return new BottomAppBar();
    }

    @Override
    protected BottomAppBar self() {
        return this;
    }
}
