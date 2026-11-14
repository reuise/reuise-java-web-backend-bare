package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
public class SvgText extends AbstractSvgText<SvgText, SvgTextOptions> {
    public SvgText() {
        this(createOptions());
    }

    public SvgText(SvgTextOptions options) {
        super(options);
    }

    public static SvgTextOptions createOptions() {
        return new SvgTextOptions();
    }

    public static SvgText create(SvgTextOptions options) {
        return new SvgText(options);
    }

    public static SvgText create(WebBackendSvgOptions options) {
        return create(new SvgTextOptions(options));
    }

    public static SvgText create() {
        return new SvgText();
    }

    @Override
    protected SvgText self() {
        return this;
    }
}
