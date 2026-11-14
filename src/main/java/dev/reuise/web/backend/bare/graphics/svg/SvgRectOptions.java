package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
public class SvgRectOptions extends AbstractSvgRectOptions<SvgRectOptions> {
    public SvgRectOptions() {
    }

    public SvgRectOptions(WebBackendSvgShapeOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SvgRectOptions self() {
        return this;
    }
}
