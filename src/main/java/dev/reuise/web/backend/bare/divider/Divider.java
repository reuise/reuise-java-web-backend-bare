package dev.reuise.web.backend.bare.divider;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Divider extends AbstractDivider<Divider, DividerOptions> {
    public Divider() {
        this(createOptions());
    }

    public Divider(DividerOptions options) {
        super(options);
    }

    public static DividerOptions createOptions() {
        return new DividerOptions();
    }

    public static Divider create(DividerOptions options) {
        return new Divider(options);
    }

    public static Divider create(WebBackendParentComponentOptions options) {
        return create(new DividerOptions(options));
    }

    public static Divider create() {
        return new Divider();
    }

    @Override
    protected Divider self() {
        return this;
    }
}
