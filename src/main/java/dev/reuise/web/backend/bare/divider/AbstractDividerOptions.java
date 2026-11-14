package dev.reuise.web.backend.bare.divider;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.divider.AbstractWebBackendDividerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.divider.BareWebDividerPartOptions;
import dev.reuise.web.core.bare.divider.DefaultBareWebDividerOptions;
public abstract class AbstractDividerOptions<S extends AbstractDividerOptions<S>> extends AbstractWebBackendDividerOptions<S> implements BareWebDividerPartOptions {
    protected final BareWebDividerPartOptions barePart;

    protected AbstractDividerOptions() {
        this(null);
    }

    protected AbstractDividerOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebDividerOptions();
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
