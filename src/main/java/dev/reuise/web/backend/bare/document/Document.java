package dev.reuise.web.backend.bare.document;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Document extends AbstractDocument<Document, DocumentOptions> {
    public Document() {
        this(createOptions());
    }

    public Document(DocumentOptions options) {
        super(options);
    }

    public static DocumentOptions createOptions() {
        return new DocumentOptions();
    }

    public static Document create(DocumentOptions options) {
        return new Document(options);
    }

    public static Document create(WebBackendParentComponentOptions options) {
        return create(new DocumentOptions(options));
    }

    public static Document create() {
        return new Document();
    }

    @Override
    protected Document self() {
        return this;
    }
}
