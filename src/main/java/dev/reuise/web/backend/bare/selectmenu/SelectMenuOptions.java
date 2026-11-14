package dev.reuise.web.backend.bare.selectmenu;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class SelectMenuOptions extends AbstractSelectMenuOptions<SelectMenuOptions> {
    public SelectMenuOptions() {
    }

    public SelectMenuOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SelectMenuOptions self() {
        return this;
    }
}
