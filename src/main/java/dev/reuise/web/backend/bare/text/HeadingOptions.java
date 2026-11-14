package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendTextOptions;
public class HeadingOptions extends AbstractHeadingOptions<HeadingOptions> {
    public HeadingOptions() {
    }

    public HeadingOptions(WebBackendTextOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected HeadingOptions self() {
        return this;
    }
}
