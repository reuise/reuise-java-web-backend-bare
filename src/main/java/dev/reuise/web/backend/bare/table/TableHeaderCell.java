package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableHeaderCell extends AbstractTableHeaderCell<TableHeaderCell, TableHeaderCellOptions> {
    public TableHeaderCell() {
        this(createOptions());
    }

    public TableHeaderCell(TableHeaderCellOptions options) {
        super(options);
    }

    public static TableHeaderCellOptions createOptions() {
        return new TableHeaderCellOptions();
    }

    public static TableHeaderCell create(TableHeaderCellOptions options) {
        return new TableHeaderCell(options);
    }

    public static TableHeaderCell create(WebBackendParentComponentOptions options) {
        return create(new TableHeaderCellOptions(options));
    }

    public static TableHeaderCell create() {
        return new TableHeaderCell();
    }

    @Override
    protected TableHeaderCell self() {
        return this;
    }
}
