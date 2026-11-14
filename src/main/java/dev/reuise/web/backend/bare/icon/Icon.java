package dev.reuise.web.backend.bare.icon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Icon extends AbstractIcon<Icon, IconOptions> {
    public Icon() {
        this(createOptions());
    }

    public Icon(IconOptions options) {
        super(options);
    }

    public static IconOptions createOptions() {
        return new IconOptions();
    }

    public static Icon create(IconOptions options) {
        return new Icon(options);
    }

    public static Icon create(WebBackendParentComponentOptions options) {
        return create(new IconOptions(options));
    }

    public static Icon create() {
        return new Icon();
    }

    @Override
    protected Icon self() {
        return this;
    }
}
