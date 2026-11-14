package dev.reuise.web.backend.bare.regionselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.regionselector.AbstractWebBackendRegionSelectorOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
import dev.reuise.web.core.bare.regionselector.BareWebRegionSelectorPartOptions;
import dev.reuise.web.core.bare.regionselector.DefaultBareWebRegionSelectorOptions;
public abstract class AbstractRegionSelectorOptions<S extends AbstractRegionSelectorOptions<S>> extends AbstractWebBackendRegionSelectorOptions<S> implements BareWebRegionSelectorPartOptions {
    protected final BareWebRegionSelectorPartOptions barePart;

    protected AbstractRegionSelectorOptions() {
        this(null);
    }

    protected AbstractRegionSelectorOptions(WebBackendSelectMenuOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebRegionSelectorOptions();
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
