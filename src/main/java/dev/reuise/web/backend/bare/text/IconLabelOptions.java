package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class IconLabelOptions extends AbstractIconLabelOptions<IconLabelOptions> {
    public IconLabelOptions() {
    }

    public IconLabelOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected IconLabelOptions self() {
        return this;
    }
}
