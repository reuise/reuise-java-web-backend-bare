package dev.reuise.web.backend.bare.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.splitcontainer.AbstractWebBackendSplitContainerDividerOptions;
import dev.reuise.web.core.bare.splitcontainer.BareWebSplitContainerDividerPartOptions;
import dev.reuise.web.core.bare.splitcontainer.DefaultBareWebSplitContainerDividerOptions;
public abstract class AbstractSplitContainerDividerOptions<S extends AbstractSplitContainerDividerOptions<S>> extends AbstractWebBackendSplitContainerDividerOptions<S> implements BareWebSplitContainerDividerPartOptions {
    protected final BareWebSplitContainerDividerPartOptions barePart;

    protected AbstractSplitContainerDividerOptions() {
        this(null);
    }

    protected AbstractSplitContainerDividerOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSplitContainerDividerOptions();
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
