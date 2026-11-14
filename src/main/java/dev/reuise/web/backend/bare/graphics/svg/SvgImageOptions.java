package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgImageOptions extends AbstractSvgImageOptions<SvgImageOptions> {
    public SvgImageOptions() {
    }

    public SvgImageOptions(WebBackendSvgOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SvgImageOptions self() {
        return this;
    }
}
