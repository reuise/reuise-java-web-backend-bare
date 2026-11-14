package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class SvgOptions extends AbstractSvgOptions<SvgOptions> {
    public SvgOptions() {
    }

    public SvgOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SvgOptions self() {
        return this;
    }
}
