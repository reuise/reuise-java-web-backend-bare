package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Paragraph extends AbstractParagraph<Paragraph, ParagraphOptions> {
    public Paragraph() {
        this(createOptions());
    }

    public Paragraph(ParagraphOptions options) {
        super(options);
    }

    public static ParagraphOptions createOptions() {
        return new ParagraphOptions();
    }

    public static Paragraph create(ParagraphOptions options) {
        return new Paragraph(options);
    }

    public static Paragraph create(WebBackendParentComponentOptions options) {
        return create(new ParagraphOptions(options));
    }

    public static Paragraph create() {
        return new Paragraph();
    }

    @Override
    protected Paragraph self() {
        return this;
    }
}
