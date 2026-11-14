package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableHeaderRow extends AbstractTableHeaderRow<TableHeaderRow, TableHeaderRowOptions> {
    public TableHeaderRow() {
        this(createOptions());
    }

    public TableHeaderRow(TableHeaderRowOptions options) {
        super(options);
    }

    public static TableHeaderRowOptions createOptions() {
        return new TableHeaderRowOptions();
    }

    public static TableHeaderRow create(TableHeaderRowOptions options) {
        return new TableHeaderRow(options);
    }

    public static TableHeaderRow create(WebBackendParentComponentOptions options) {
        return create(new TableHeaderRowOptions(options));
    }

    public static TableHeaderRow create() {
        return new TableHeaderRow();
    }

    @Override
    protected TableHeaderRow self() {
        return this;
    }
}
