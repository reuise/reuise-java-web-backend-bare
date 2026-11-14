package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
public class SvgPath extends AbstractSvgPath<SvgPath, SvgPathOptions> {
    public SvgPath() {
        this(createOptions());
    }

    public SvgPath(SvgPathOptions options) {
        super(options);
    }

    public static SvgPathOptions createOptions() {
        return new SvgPathOptions();
    }

    public static SvgPath create(SvgPathOptions options) {
        return new SvgPath(options);
    }

    public static SvgPath create(WebBackendSvgShapeOptions options) {
        return create(new SvgPathOptions(options));
    }

    public static SvgPath create() {
        return new SvgPath();
    }

    @Override
    protected SvgPath self() {
        return this;
    }
}
