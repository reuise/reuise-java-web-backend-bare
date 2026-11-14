package dev.reuise.web.backend.bare.document;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.document.AbstractWebBackendDocumentBodyOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.document.BareWebDocumentBodyPartOptions;
import dev.reuise.web.core.bare.document.DefaultBareWebDocumentBodyOptions;
public abstract class AbstractDocumentBodyOptions<S extends AbstractDocumentBodyOptions<S>> extends AbstractWebBackendDocumentBodyOptions<S> implements BareWebDocumentBodyPartOptions {
    protected final BareWebDocumentBodyPartOptions barePart;

    protected AbstractDocumentBodyOptions() {
        this(null);
    }

    protected AbstractDocumentBodyOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebDocumentBodyOptions();
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
