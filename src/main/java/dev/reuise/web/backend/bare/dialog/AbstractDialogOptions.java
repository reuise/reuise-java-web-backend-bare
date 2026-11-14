package dev.reuise.web.backend.bare.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.dialog.AbstractWebBackendDialogOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.dialog.BareWebDialogPartOptions;
import dev.reuise.web.core.bare.dialog.DefaultBareWebDialogOptions;
public abstract class AbstractDialogOptions<S extends AbstractDialogOptions<S>> extends AbstractWebBackendDialogOptions<S> implements BareWebDialogPartOptions {
    protected final BareWebDialogPartOptions barePart;

    protected AbstractDialogOptions() {
        this(null);
    }

    protected AbstractDialogOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebDialogOptions();
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
