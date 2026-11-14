package dev.reuise.web.backend.bare.badge;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class BadgeOptions extends AbstractBadgeOptions<BadgeOptions> {
    public BadgeOptions() {
    }

    public BadgeOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected BadgeOptions self() {
        return this;
    }
}
