package dev.reuise.web.backend.bare.document;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.document.AbstractWebBackendDocumentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.document.BareWebDocumentPartOptions;
import dev.reuise.web.core.bare.document.DefaultBareWebDocumentOptions;
public abstract class AbstractDocumentOptions<S extends AbstractDocumentOptions<S>> extends AbstractWebBackendDocumentOptions<S> implements BareWebDocumentPartOptions {
    protected final BareWebDocumentPartOptions barePart;

    protected AbstractDocumentOptions() {
        this(null);
    }

    protected AbstractDocumentOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebDocumentOptions();
        ((BaseComponentOptions) (getBaseComponentPart())).initialize(this);
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    public WebBackendComponentFactory getComponentFactory() {
        return DefaultComponentFactory.get();
    }
}
