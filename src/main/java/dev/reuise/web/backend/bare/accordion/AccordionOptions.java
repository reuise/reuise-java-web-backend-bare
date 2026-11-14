package dev.reuise.web.backend.bare.accordion;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class AccordionOptions extends AbstractAccordionOptions<AccordionOptions> {
    public AccordionOptions() {
    }

    public AccordionOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected AccordionOptions self() {
        return this;
    }
}
