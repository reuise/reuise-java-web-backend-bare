package dev.reuise.web.backend.bare.button;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class IconButtonOptions extends AbstractIconButtonOptions<IconButtonOptions> {
    public IconButtonOptions() {
    }

    public IconButtonOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected IconButtonOptions self() {
        return this;
    }
}
