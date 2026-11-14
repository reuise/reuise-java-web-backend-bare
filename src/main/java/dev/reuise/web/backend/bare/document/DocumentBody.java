package dev.reuise.web.backend.bare.document;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class DocumentBody extends AbstractDocumentBody<DocumentBody, DocumentBodyOptions> {
    public DocumentBody() {
        this(createOptions());
    }

    public DocumentBody(DocumentBodyOptions options) {
        super(options);
    }

    public static DocumentBodyOptions createOptions() {
        return new DocumentBodyOptions();
    }

    public static DocumentBody create(DocumentBodyOptions options) {
        return new DocumentBody(options);
    }

    public static DocumentBody create(WebBackendParentComponentOptions options) {
        return create(new DocumentBodyOptions(options));
    }

    public static DocumentBody create() {
        return new DocumentBody();
    }

    @Override
    protected DocumentBody self() {
        return this;
    }
}
