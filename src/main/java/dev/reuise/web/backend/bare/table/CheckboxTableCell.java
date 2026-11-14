package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.table.WebBackendTableCellOptions;
public class CheckboxTableCell extends AbstractCheckboxTableCell<CheckboxTableCell, CheckboxTableCellOptions> {
    public CheckboxTableCell() {
        this(createOptions());
    }

    public CheckboxTableCell(CheckboxTableCellOptions options) {
        super(options);
    }

    public static CheckboxTableCellOptions createOptions() {
        return new CheckboxTableCellOptions();
    }

    public static CheckboxTableCell create(CheckboxTableCellOptions options) {
        return new CheckboxTableCell(options);
    }

    public static CheckboxTableCell create(WebBackendTableCellOptions options) {
        return create(new CheckboxTableCellOptions(options));
    }

    public static CheckboxTableCell create() {
        return new CheckboxTableCell();
    }

    @Override
    protected CheckboxTableCell self() {
        return this;
    }
}
