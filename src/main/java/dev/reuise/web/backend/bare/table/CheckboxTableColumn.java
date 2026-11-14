package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.table.WebBackendTableColumnOptions;
public class CheckboxTableColumn extends AbstractCheckboxTableColumn<CheckboxTableColumn, CheckboxTableColumnOptions> {
    public CheckboxTableColumn() {
        this(createOptions());
    }

    public CheckboxTableColumn(CheckboxTableColumnOptions options) {
        super(options);
    }

    public static CheckboxTableColumnOptions createOptions() {
        return new CheckboxTableColumnOptions();
    }

    public static CheckboxTableColumn create(CheckboxTableColumnOptions options) {
        return new CheckboxTableColumn(options);
    }

    public static CheckboxTableColumn create(WebBackendTableColumnOptions options) {
        return create(new CheckboxTableColumnOptions(options));
    }

    public static CheckboxTableColumn create() {
        return new CheckboxTableColumn();
    }

    @Override
    protected CheckboxTableColumn self() {
        return this;
    }
}
