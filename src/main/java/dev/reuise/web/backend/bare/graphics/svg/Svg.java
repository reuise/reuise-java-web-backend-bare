package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Svg extends AbstractSvg<Svg, SvgOptions> {
    public Svg() {
        this(createOptions());
    }

    public Svg(SvgOptions options) {
        super(options);
    }

    public static SvgOptions createOptions() {
        return new SvgOptions();
    }

    public static Svg create(SvgOptions options) {
        return new Svg(options);
    }

    public static Svg create(WebBackendParentComponentOptions options) {
        return create(new SvgOptions(options));
    }

    public static Svg create() {
        return new Svg();
    }

    @Override
    protected Svg self() {
        return this;
    }
}
