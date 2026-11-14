package dev.reuise.web.backend.bare.icon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class IconOptions extends AbstractIconOptions<IconOptions> {
    public IconOptions() {
    }

    public IconOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected IconOptions self() {
        return this;
    }
}
