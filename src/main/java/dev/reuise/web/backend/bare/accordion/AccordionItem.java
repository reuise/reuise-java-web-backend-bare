package dev.reuise.web.backend.bare.accordion;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class AccordionItem extends AbstractAccordionItem<AccordionItem, AccordionItemOptions> {
    public AccordionItem() {
        this(createOptions());
    }

    public AccordionItem(AccordionItemOptions options) {
        super(options);
    }

    public static AccordionItemOptions createOptions() {
        return new AccordionItemOptions();
    }

    public static AccordionItem create(AccordionItemOptions options) {
        return new AccordionItem(options);
    }

    public static AccordionItem create(WebBackendFlexContainerOptions options) {
        return create(new AccordionItemOptions(options));
    }

    public static AccordionItem create() {
        return new AccordionItem();
    }

    @Override
    protected AccordionItem self() {
        return this;
    }
}
