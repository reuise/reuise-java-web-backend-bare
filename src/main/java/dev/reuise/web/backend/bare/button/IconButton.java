package dev.reuise.web.backend.bare.button;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class IconButton extends AbstractIconButton<IconButton, IconButtonOptions> {
    public IconButton() {
        this(createOptions());
    }

    public IconButton(IconButtonOptions options) {
        super(options);
    }

    public static IconButtonOptions createOptions() {
        return new IconButtonOptions();
    }

    public static IconButton create(IconButtonOptions options) {
        return new IconButton(options);
    }

    public static IconButton create(WebBackendParentComponentOptions options) {
        return create(new IconButtonOptions(options));
    }

    public static IconButton create() {
        return new IconButton();
    }

    @Override
    protected IconButton self() {
        return this;
    }
}
