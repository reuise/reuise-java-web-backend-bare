package dev.reuise.web.backend.bare.selectmenu;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class SelectMenu extends AbstractSelectMenu<SelectMenu, SelectMenuOptions> {
    public SelectMenu() {
        this(createOptions());
    }

    public SelectMenu(SelectMenuOptions options) {
        super(options);
    }

    public static SelectMenuOptions createOptions() {
        return new SelectMenuOptions();
    }

    public static SelectMenu create(SelectMenuOptions options) {
        return new SelectMenu(options);
    }

    public static SelectMenu create(WebBackendParentComponentOptions options) {
        return create(new SelectMenuOptions(options));
    }

    public static SelectMenu create() {
        return new SelectMenu();
    }

    @Override
    protected SelectMenu self() {
        return this;
    }
}
