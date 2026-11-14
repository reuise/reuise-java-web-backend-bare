package dev.reuise.web.backend.bare.currencyselector;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
public class CurrencySelectorOptions extends AbstractCurrencySelectorOptions<CurrencySelectorOptions> {
    public CurrencySelectorOptions() {
    }

    public CurrencySelectorOptions(WebBackendSelectMenuOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CurrencySelectorOptions self() {
        return this;
    }
}
