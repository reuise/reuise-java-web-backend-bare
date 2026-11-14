package dev.reuise.web.backend.bare.view;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class View extends AbstractView<View, ViewOptions> {
    public View() {
        this(createOptions());
    }

    public View(ViewOptions options) {
        super(options);
    }

    public static ViewOptions createOptions() {
        return new ViewOptions();
    }

    public static View create(ViewOptions options) {
        return new View(options);
    }

    public static View create(WebBackendFlexContainerOptions options) {
        return create(new ViewOptions(options));
    }

    public static View create() {
        return new View();
    }

    @Override
    protected View self() {
        return this;
    }
}
