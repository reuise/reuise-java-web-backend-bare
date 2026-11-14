package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class IconLabel extends AbstractIconLabel<IconLabel, IconLabelOptions> {
    public IconLabel() {
        this(createOptions());
    }

    public IconLabel(IconLabelOptions options) {
        super(options);
    }

    public static IconLabelOptions createOptions() {
        return new IconLabelOptions();
    }

    public static IconLabel create(IconLabelOptions options) {
        return new IconLabel(options);
    }

    public static IconLabel create(WebBackendParentComponentOptions options) {
        return create(new IconLabelOptions(options));
    }

    public static IconLabel create() {
        return new IconLabel();
    }

    @Override
    protected IconLabel self() {
        return this;
    }
}
