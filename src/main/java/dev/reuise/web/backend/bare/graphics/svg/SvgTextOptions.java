package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgTextOptions extends AbstractSvgTextOptions<SvgTextOptions> {
    public SvgTextOptions() {
    }

    public SvgTextOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SvgTextOptions self() {
        return this;
    }
}
