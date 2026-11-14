package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ListView extends AbstractListView<ListView, ListViewOptions> {
    public ListView() {
        this(createOptions());
    }

    public ListView(ListViewOptions options) {
        super(options);
    }

    public static ListViewOptions createOptions() {
        return new ListViewOptions();
    }

    public static ListView create(ListViewOptions options) {
        return new ListView(options);
    }

    public static ListView create(WebBackendParentComponentOptions options) {
        return create(new ListViewOptions(options));
    }

    public static ListView create() {
        return new ListView();
    }

    @Override
    protected ListView self() {
        return this;
    }
}
