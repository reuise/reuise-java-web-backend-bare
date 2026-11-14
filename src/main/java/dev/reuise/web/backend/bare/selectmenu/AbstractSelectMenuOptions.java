package dev.reuise.web.backend.bare.selectmenu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.selectmenu.AbstractWebBackendSelectMenuOptions;
import dev.reuise.web.core.bare.selectmenu.BareWebSelectMenuPartOptions;
import dev.reuise.web.core.bare.selectmenu.DefaultBareWebSelectMenuOptions;
public abstract class AbstractSelectMenuOptions<S extends AbstractSelectMenuOptions<S>> extends AbstractWebBackendSelectMenuOptions<S> implements BareWebSelectMenuPartOptions {
    protected final BareWebSelectMenuPartOptions barePart;

    protected AbstractSelectMenuOptions() {
        this(null);
    }

    protected AbstractSelectMenuOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSelectMenuOptions();
        ((BaseComponentOptions) (getBaseComponentPart())).initialize(this);
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    public WebBackendComponentFactory getComponentFactory() {
        return DefaultComponentFactory.get();
    }
}
