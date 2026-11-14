package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableCell extends AbstractTableCell<TableCell, TableCellOptions> {
    public TableCell() {
        this(createOptions());
    }

    public TableCell(TableCellOptions options) {
        super(options);
    }

    public static TableCellOptions createOptions() {
        return new TableCellOptions();
    }

    public static TableCell create(TableCellOptions options) {
        return new TableCell(options);
    }

    public static TableCell create(WebBackendParentComponentOptions options) {
        return create(new TableCellOptions(options));
    }

    public static TableCell create() {
        return new TableCell();
    }

    @Override
    protected TableCell self() {
        return this;
    }
}
