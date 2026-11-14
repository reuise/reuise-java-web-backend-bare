package dev.reuise.web.backend.bare.image;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class Image extends AbstractImage<Image, ImageOptions> {
    public Image() {
        this(createOptions());
    }

    public Image(ImageOptions options) {
        super(options);
    }

    public static ImageOptions createOptions() {
        return new ImageOptions();
    }

    public static Image create(ImageOptions options) {
        return new Image(options);
    }

    public static Image create(WebBackendBaseComponentOptions options) {
        return create(new ImageOptions(options));
    }

    public static Image create() {
        return new Image();
    }

    @Override
    protected Image self() {
        return this;
    }
}
