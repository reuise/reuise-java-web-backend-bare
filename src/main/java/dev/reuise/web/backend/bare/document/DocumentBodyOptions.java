package dev.reuise.web.backend.bare.document;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class DocumentBodyOptions extends AbstractDocumentBodyOptions<DocumentBodyOptions> {
    public DocumentBodyOptions() {
    }

    public DocumentBodyOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected DocumentBodyOptions self() {
        return this;
    }
}
