package dev.reuise.web.backend.bare.accordion;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.accordion.AbstractWebBackendAccordionItemOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.core.bare.accordion.BareWebAccordionItemPartOptions;
import dev.reuise.web.core.bare.accordion.DefaultBareWebAccordionItemOptions;
public abstract class AbstractAccordionItemOptions<S extends AbstractAccordionItemOptions<S>> extends AbstractWebBackendAccordionItemOptions<S> implements BareWebAccordionItemPartOptions {
    protected final BareWebAccordionItemPartOptions barePart;

    protected AbstractAccordionItemOptions() {
        this(null);
    }

    protected AbstractAccordionItemOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebAccordionItemOptions();
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
