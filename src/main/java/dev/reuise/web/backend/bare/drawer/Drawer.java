package dev.reuise.web.backend.bare.drawer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class Drawer extends AbstractDrawer<Drawer, DrawerOptions> {
    public Drawer() {
        this(createOptions());
    }

    public Drawer(DrawerOptions options) {
        super(options);
    }

    public static DrawerOptions createOptions() {
        return new DrawerOptions();
    }

    public static Drawer create(DrawerOptions options) {
        return new Drawer(options);
    }

    public static Drawer create(WebBackendContainerOptions options) {
        return create(new DrawerOptions(options));
    }

    public static Drawer create() {
        return new Drawer();
    }

    @Override
    protected Drawer self() {
        return this;
    }
}
