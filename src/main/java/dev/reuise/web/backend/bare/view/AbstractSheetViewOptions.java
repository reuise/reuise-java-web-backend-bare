package dev.reuise.web.backend.bare.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.view.AbstractWebBackendSheetViewOptions;
import dev.reuise.web.backend.view.WebBackendViewOptions;
import dev.reuise.web.core.bare.view.BareWebSheetViewPartOptions;
import dev.reuise.web.core.bare.view.DefaultBareWebSheetViewOptions;
public abstract class AbstractSheetViewOptions<S extends AbstractSheetViewOptions<S>> extends AbstractWebBackendSheetViewOptions<S> implements BareWebSheetViewPartOptions {
    protected final BareWebSheetViewPartOptions barePart;

    protected AbstractSheetViewOptions() {
        this(null);
    }

    protected AbstractSheetViewOptions(WebBackendViewOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSheetViewOptions();
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
