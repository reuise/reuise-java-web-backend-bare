package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ParagraphOptions extends AbstractParagraphOptions<ParagraphOptions> {
    public ParagraphOptions() {
    }

    public ParagraphOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ParagraphOptions self() {
        return this;
    }
}
