package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.scrollablecontainer.AbstractWebBackendScrollableContainerScrollAreaOptions;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerScrollAreaPartOptions;
import dev.reuise.web.core.bare.scrollablecontainer.DefaultBareWebScrollableContainerScrollAreaOptions;
public abstract class AbstractScrollableContainerScrollAreaOptions<S extends AbstractScrollableContainerScrollAreaOptions<S>> extends AbstractWebBackendScrollableContainerScrollAreaOptions<S> implements BareWebScrollableContainerScrollAreaPartOptions {
    protected final BareWebScrollableContainerScrollAreaPartOptions barePart;

    protected AbstractScrollableContainerScrollAreaOptions() {
        this(null);
    }

    protected AbstractScrollableContainerScrollAreaOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebScrollableContainerScrollAreaOptions();
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
