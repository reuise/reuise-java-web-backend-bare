package dev.reuise.web.backend.bare.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.dialog.AbstractWebBackendMessageDialogOptions;
import dev.reuise.web.backend.dialog.WebBackendDialogOptions;
import dev.reuise.web.core.bare.dialog.BareWebMessageDialogPartOptions;
import dev.reuise.web.core.bare.dialog.DefaultBareWebMessageDialogOptions;
public abstract class AbstractMessageDialogOptions<S extends AbstractMessageDialogOptions<S>> extends AbstractWebBackendMessageDialogOptions<S> implements BareWebMessageDialogPartOptions {
    protected final BareWebMessageDialogPartOptions barePart;

    protected AbstractMessageDialogOptions() {
        this(null);
    }

    protected AbstractMessageDialogOptions(WebBackendDialogOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMessageDialogOptions();
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
