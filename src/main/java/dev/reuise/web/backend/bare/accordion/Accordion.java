package dev.reuise.web.backend.bare.accordion;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class Accordion extends AbstractAccordion<Accordion, AccordionOptions> {
    public Accordion() {
        this(createOptions());
    }

    public Accordion(AccordionOptions options) {
        super(options);
    }

    public static AccordionOptions createOptions() {
        return new AccordionOptions();
    }

    public static Accordion create(AccordionOptions options) {
        return new Accordion(options);
    }

    public static Accordion create(WebBackendFlexContainerOptions options) {
        return create(new AccordionOptions(options));
    }

    public static Accordion create() {
        return new Accordion();
    }

    @Override
    protected Accordion self() {
        return this;
    }
}
