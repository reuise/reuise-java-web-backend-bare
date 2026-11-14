package dev.reuise.web.backend.bare.link;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class LinkOptions extends AbstractLinkOptions<LinkOptions> {
    public LinkOptions() {
    }

    public LinkOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected LinkOptions self() {
        return this;
    }
}
