package dev.reuise.web.backend.bare.document;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class DocumentOptions extends AbstractDocumentOptions<DocumentOptions> {
    public DocumentOptions() {
    }

    public DocumentOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected DocumentOptions self() {
        return this;
    }
}
