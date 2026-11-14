package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableCellOptions extends AbstractTableCellOptions<TableCellOptions> {
    public TableCellOptions() {
    }

    public TableCellOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableCellOptions self() {
        return this;
    }
}
