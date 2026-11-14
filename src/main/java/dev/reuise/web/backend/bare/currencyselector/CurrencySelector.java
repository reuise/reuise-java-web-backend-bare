package dev.reuise.web.backend.bare.currencyselector;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
public class CurrencySelector extends AbstractCurrencySelector<CurrencySelector, CurrencySelectorOptions> {
    public CurrencySelector() {
        this(createOptions());
    }

    public CurrencySelector(CurrencySelectorOptions options) {
        super(options);
    }

    public static CurrencySelectorOptions createOptions() {
        return new CurrencySelectorOptions();
    }

    public static CurrencySelector create(CurrencySelectorOptions options) {
        return new CurrencySelector(options);
    }

    public static CurrencySelector create(WebBackendSelectMenuOptions options) {
        return create(new CurrencySelectorOptions(options));
    }

    public static CurrencySelector create() {
        return new CurrencySelector();
    }

    @Override
    protected CurrencySelector self() {
        return this;
    }
}
