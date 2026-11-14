package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgImage extends AbstractSvgImage<SvgImage, SvgImageOptions> {
    public SvgImage() {
        this(createOptions());
    }

    public SvgImage(SvgImageOptions options) {
        super(options);
    }

    public static SvgImageOptions createOptions() {
        return new SvgImageOptions();
    }

    public static SvgImage create(SvgImageOptions options) {
        return new SvgImage(options);
    }

    public static SvgImage create(WebBackendSvgOptions options) {
        return create(new SvgImageOptions(options));
    }

    public static SvgImage create() {
        return new SvgImage();
    }

    @Override
    protected SvgImage self() {
        return this;
    }
}
