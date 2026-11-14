package dev.reuise.web.backend.bare.currencyselector;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.currencyselector.DefaultWebBackendCurrencySelector;
import dev.reuise.web.core.bare.currencyselector.BareWebCurrencySelector;
import dev.reuise.web.core.bare.currencyselector.BareWebCurrencySelectorPart;
import dev.reuise.web.core.bare.currencyselector.DefaultBareWebCurrencySelectorPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCurrencySelector<S extends AbstractCurrencySelector<S, O>, O extends AbstractCurrencySelectorOptions<?>> extends DefaultWebBackendCurrencySelector<S, O> implements WebBackendComponentPart , BareWebCurrencySelector {
    protected final BareWebCurrencySelectorPart barePart;

    protected AbstractCurrencySelector(O options) {
        super(options);
        barePart = new DefaultBareWebCurrencySelectorPart(options);
        if (options == null)
            return;

        // addPart(ComponentPart.Type.DESIGN, barePart)
        initialize(self(), options);
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}
