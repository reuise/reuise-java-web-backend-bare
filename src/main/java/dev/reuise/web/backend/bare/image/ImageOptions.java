package dev.reuise.web.backend.bare.image;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class ImageOptions extends AbstractImageOptions<ImageOptions> {
    public ImageOptions() {
    }

    public ImageOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ImageOptions self() {
        return this;
    }
}
