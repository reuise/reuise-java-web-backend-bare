package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableColumn extends AbstractTableColumn<TableColumn, TableColumnOptions> {
    public TableColumn() {
        this(createOptions());
    }

    public TableColumn(TableColumnOptions options) {
        super(options);
    }

    public static TableColumnOptions createOptions() {
        return new TableColumnOptions();
    }

    public static TableColumn create(TableColumnOptions options) {
        return new TableColumn(options);
    }

    public static TableColumn create(WebBackendParentComponentOptions options) {
        return create(new TableColumnOptions(options));
    }

    public static TableColumn create() {
        return new TableColumn();
    }

    @Override
    protected TableColumn self() {
        return this;
    }
}
