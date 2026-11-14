package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.AbstractWebBackendSheetLayoutOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerOptions;
import dev.reuise.web.core.bare.layout.BareWebSheetLayoutPartOptions;
import dev.reuise.web.core.bare.layout.DefaultBareWebSheetLayoutOptions;
public abstract class AbstractSheetLayoutOptions<S extends AbstractSheetLayoutOptions<S>> extends AbstractWebBackendSheetLayoutOptions<S> implements BareWebSheetLayoutPartOptions {
    protected final BareWebSheetLayoutPartOptions barePart;

    protected AbstractSheetLayoutOptions() {
        this(null);
    }

    protected AbstractSheetLayoutOptions(WebBackendSplitContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSheetLayoutOptions();
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
