package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgShape extends AbstractSvgShape<SvgShape, SvgShapeOptions> {
    public SvgShape() {
        this(createOptions());
    }

    public SvgShape(SvgShapeOptions options) {
        super(options);
    }

    public static SvgShapeOptions createOptions() {
        return new SvgShapeOptions();
    }

    public static SvgShape create(SvgShapeOptions options) {
        return new SvgShape(options);
    }

    public static SvgShape create(WebBackendSvgOptions options) {
        return create(new SvgShapeOptions(options));
    }

    public static SvgShape create() {
        return new SvgShape();
    }

    @Override
    protected SvgShape self() {
        return this;
    }
}
