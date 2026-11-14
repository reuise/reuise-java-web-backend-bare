package dev.reuise.web.backend.bare.link;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Link extends AbstractLink<Link, LinkOptions> {
    public Link() {
        this(createOptions());
    }

    public Link(LinkOptions options) {
        super(options);
    }

    public static LinkOptions createOptions() {
        return new LinkOptions();
    }

    public static Link create(LinkOptions options) {
        return new Link(options);
    }

    public static Link create(WebBackendParentComponentOptions options) {
        return create(new LinkOptions(options));
    }

    public static Link create() {
        return new Link();
    }

    @Override
    protected Link self() {
        return this;
    }
}
