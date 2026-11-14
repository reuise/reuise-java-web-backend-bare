package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.table.WebBackendTableColumnOptions;
public class CheckboxTableColumnOptions extends AbstractCheckboxTableColumnOptions<CheckboxTableColumnOptions> {
    public CheckboxTableColumnOptions() {
    }

    public CheckboxTableColumnOptions(WebBackendTableColumnOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CheckboxTableColumnOptions self() {
        return this;
    }
}
