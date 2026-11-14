package dev.reuise.web.backend.bare.accordion;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.accordion.AbstractWebBackendAccordionOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.accordion.BareWebAccordionPartOptions;
import dev.reuise.web.core.bare.accordion.DefaultBareWebAccordionOptions;
public abstract class AbstractAccordionOptions<S extends AbstractAccordionOptions<S>> extends AbstractWebBackendAccordionOptions<S> implements BareWebAccordionPartOptions {
    protected final BareWebAccordionPartOptions barePart;

    protected AbstractAccordionOptions() {
        this(null);
    }

    protected AbstractAccordionOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebAccordionOptions();
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
