package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class LineBreakOptions extends AbstractLineBreakOptions<LineBreakOptions> {
    public LineBreakOptions() {
    }

    public LineBreakOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected LineBreakOptions self() {
        return this;
    }
}
