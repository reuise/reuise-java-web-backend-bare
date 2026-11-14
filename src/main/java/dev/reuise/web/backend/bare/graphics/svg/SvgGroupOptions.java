package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgGroupOptions extends AbstractSvgGroupOptions<SvgGroupOptions> {
    public SvgGroupOptions() {
    }

    public SvgGroupOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SvgGroupOptions self() {
        return this;
    }
}
