package dev.reuise.web.backend.bare.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.navigation.AbstractWebBackendNavigationTreeGroupOptions;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreeGroupPartOptions;
import dev.reuise.web.core.bare.navigation.DefaultBareWebNavigationTreeGroupOptions;
public abstract class AbstractNavigationTreeGroupOptions<S extends AbstractNavigationTreeGroupOptions<S>> extends AbstractWebBackendNavigationTreeGroupOptions<S> implements BareWebNavigationTreeGroupPartOptions {
    protected final BareWebNavigationTreeGroupPartOptions barePart;

    protected AbstractNavigationTreeGroupOptions() {
        this(null);
    }

    protected AbstractNavigationTreeGroupOptions(WebBackendAccordionItemOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebNavigationTreeGroupOptions();
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
