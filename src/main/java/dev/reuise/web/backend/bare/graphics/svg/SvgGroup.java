package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgGroup extends AbstractSvgGroup<SvgGroup, SvgGroupOptions> {
    public SvgGroup() {
        this(createOptions());
    }

    public SvgGroup(SvgGroupOptions options) {
        super(options);
    }

    public static SvgGroupOptions createOptions() {
        return new SvgGroupOptions();
    }

    public static SvgGroup create(SvgGroupOptions options) {
        return new SvgGroup(options);
    }

    public static SvgGroup create(WebBackendSvgOptions options) {
        return create(new SvgGroupOptions(options));
    }

    public static SvgGroup create() {
        return new SvgGroup();
    }

    @Override
    protected SvgGroup self() {
        return this;
    }
}
