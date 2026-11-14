package dev.reuise.web.backend.bare.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.accordion.WebBackendAccordionOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.navigation.AbstractWebBackendNavigationTreeOptions;
import dev.reuise.web.core.bare.navigation.BareWebNavigationTreePartOptions;
import dev.reuise.web.core.bare.navigation.DefaultBareWebNavigationTreeOptions;
public abstract class AbstractNavigationTreeOptions<S extends AbstractNavigationTreeOptions<S>> extends AbstractWebBackendNavigationTreeOptions<S> implements BareWebNavigationTreePartOptions {
    protected final BareWebNavigationTreePartOptions barePart;

    protected AbstractNavigationTreeOptions() {
        this(null);
    }

    protected AbstractNavigationTreeOptions(WebBackendAccordionOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebNavigationTreeOptions();
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
