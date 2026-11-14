package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Menu extends AbstractMenu<Menu, MenuOptions> {
    public Menu() {
        this(createOptions());
    }

    public Menu(MenuOptions options) {
        super(options);
    }

    public static MenuOptions createOptions() {
        return new MenuOptions();
    }

    public static Menu create(MenuOptions options) {
        return new Menu(options);
    }

    public static Menu create(WebBackendParentComponentOptions options) {
        return create(new MenuOptions(options));
    }

    public static Menu create() {
        return new Menu();
    }

    @Override
    protected Menu self() {
        return this;
    }
}
