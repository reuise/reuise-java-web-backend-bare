package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
public class SvgRect extends AbstractSvgRect<SvgRect, SvgRectOptions> {
    public SvgRect() {
        this(createOptions());
    }

    public SvgRect(SvgRectOptions options) {
        super(options);
    }

    public static SvgRectOptions createOptions() {
        return new SvgRectOptions();
    }

    public static SvgRect create(SvgRectOptions options) {
        return new SvgRect(options);
    }

    public static SvgRect create(WebBackendSvgShapeOptions options) {
        return create(new SvgRectOptions(options));
    }

    public static SvgRect create() {
        return new SvgRect();
    }

    @Override
    protected SvgRect self() {
        return this;
    }
}
