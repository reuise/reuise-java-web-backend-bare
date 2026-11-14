package dev.reuise.web.backend.bare.menu;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class MenuButton extends AbstractMenuButton<MenuButton, MenuButtonOptions> {
    public MenuButton() {
        this(createOptions());
    }

    public MenuButton(MenuButtonOptions options) {
        super(options);
    }

    public static MenuButtonOptions createOptions() {
        return new MenuButtonOptions();
    }

    public static MenuButton create(MenuButtonOptions options) {
        return new MenuButton(options);
    }

    public static MenuButton create(WebBackendContainerOptions options) {
        return create(new MenuButtonOptions(options));
    }

    public static MenuButton create() {
        return new MenuButton();
    }

    @Override
    protected MenuButton self() {
        return this;
    }
}
