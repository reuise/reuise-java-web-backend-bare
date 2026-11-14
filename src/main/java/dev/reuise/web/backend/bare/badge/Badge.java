package dev.reuise.web.backend.bare.badge;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class Badge extends AbstractBadge<Badge, BadgeOptions> {
    public Badge() {
        this(createOptions());
    }

    public Badge(BadgeOptions options) {
        super(options);
    }

    public static BadgeOptions createOptions() {
        return new BadgeOptions();
    }

    public static Badge create(BadgeOptions options) {
        return new Badge(options);
    }

    public static Badge create(WebBackendBaseComponentOptions options) {
        return create(new BadgeOptions(options));
    }

    public static Badge create() {
        return new Badge();
    }

    @Override
    protected Badge self() {
        return this;
    }
}
