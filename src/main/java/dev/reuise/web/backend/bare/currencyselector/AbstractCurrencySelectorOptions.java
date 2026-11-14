package dev.reuise.web.backend.bare.currencyselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.currencyselector.AbstractWebBackendCurrencySelectorOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
import dev.reuise.web.core.bare.currencyselector.BareWebCurrencySelectorPartOptions;
import dev.reuise.web.core.bare.currencyselector.DefaultBareWebCurrencySelectorOptions;
public abstract class AbstractCurrencySelectorOptions<S extends AbstractCurrencySelectorOptions<S>> extends AbstractWebBackendCurrencySelectorOptions<S> implements BareWebCurrencySelectorPartOptions {
    protected final BareWebCurrencySelectorPartOptions barePart;

    protected AbstractCurrencySelectorOptions() {
        this(null);
    }

    protected AbstractCurrencySelectorOptions(WebBackendSelectMenuOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebCurrencySelectorOptions();
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
