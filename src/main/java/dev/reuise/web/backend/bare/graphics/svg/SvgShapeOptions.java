package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgShapeOptions extends AbstractSvgShapeOptions<SvgShapeOptions> {
    public SvgShapeOptions() {
    }

    public SvgShapeOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SvgShapeOptions self() {
        return this;
    }
}
