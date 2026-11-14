package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
public class SvgPathOptions extends AbstractSvgPathOptions<SvgPathOptions> {
    public SvgPathOptions() {
    }

    public SvgPathOptions(WebBackendSvgShapeOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SvgPathOptions self() {
        return this;
    }
}
