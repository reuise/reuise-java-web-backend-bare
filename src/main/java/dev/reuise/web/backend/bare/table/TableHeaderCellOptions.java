package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableHeaderCellOptions extends AbstractTableHeaderCellOptions<TableHeaderCellOptions> {
    public TableHeaderCellOptions() {
    }

    public TableHeaderCellOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableHeaderCellOptions self() {
        return this;
    }
}
