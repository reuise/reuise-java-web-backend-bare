package dev.reuise.web.backend.bare.dropzone;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.dropzone.AbstractWebBackendDropZoneOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.dropzone.BareWebDropZonePartOptions;
import dev.reuise.web.core.bare.dropzone.DefaultBareWebDropZoneOptions;
public abstract class AbstractDropZoneOptions<S extends AbstractDropZoneOptions<S>> extends AbstractWebBackendDropZoneOptions<S> implements BareWebDropZonePartOptions {
    protected final BareWebDropZonePartOptions barePart;

    protected AbstractDropZoneOptions() {
        this(null);
    }

    protected AbstractDropZoneOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebDropZoneOptions();
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
