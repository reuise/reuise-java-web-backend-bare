package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class LineBreak extends AbstractLineBreak<LineBreak, LineBreakOptions> {
    public LineBreak() {
        this(createOptions());
    }

    public LineBreak(LineBreakOptions options) {
        super(options);
    }

    public static LineBreakOptions createOptions() {
        return new LineBreakOptions();
    }

    public static LineBreak create(LineBreakOptions options) {
        return new LineBreak(options);
    }

    public static LineBreak create(WebBackendBaseComponentOptions options) {
        return create(new LineBreakOptions(options));
    }

    public static LineBreak create() {
        return new LineBreak();
    }

    @Override
    protected LineBreak self() {
        return this;
    }
}
