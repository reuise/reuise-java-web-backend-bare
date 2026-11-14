package dev.reuise.web.backend.bare.accordion;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class AccordionItemOptions extends AbstractAccordionItemOptions<AccordionItemOptions> {
    public AccordionItemOptions() {
    }

    public AccordionItemOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected AccordionItemOptions self() {
        return this;
    }
}
