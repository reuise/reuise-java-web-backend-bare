package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.table.WebBackendTableCellOptions;
public class CheckboxTableCellOptions extends AbstractCheckboxTableCellOptions<CheckboxTableCellOptions> {
    public CheckboxTableCellOptions() {
    }

    public CheckboxTableCellOptions(WebBackendTableCellOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected CheckboxTableCellOptions self() {
        return this;
    }
}
