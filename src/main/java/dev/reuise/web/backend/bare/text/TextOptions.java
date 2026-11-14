package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TextOptions extends AbstractTextOptions<TextOptions> {
    public TextOptions() {
    }

    public TextOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TextOptions self() {
        return this;
    }
}
