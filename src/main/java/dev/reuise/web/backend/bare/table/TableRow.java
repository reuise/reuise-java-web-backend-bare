package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableRow extends AbstractTableRow<TableRow, TableRowOptions> {
    public TableRow() {
        this(createOptions());
    }

    public TableRow(TableRowOptions options) {
        super(options);
    }

    public static TableRowOptions createOptions() {
        return new TableRowOptions();
    }

    public static TableRow create(TableRowOptions options) {
        return new TableRow(options);
    }

    public static TableRow create(WebBackendParentComponentOptions options) {
        return create(new TableRowOptions(options));
    }

    public static TableRow create() {
        return new TableRow();
    }

    @Override
    protected TableRow self() {
        return this;
    }
}
