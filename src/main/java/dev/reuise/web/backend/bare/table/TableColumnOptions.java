package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableColumnOptions extends AbstractTableColumnOptions<TableColumnOptions> {
    public TableColumnOptions() {
    }

    public TableColumnOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableColumnOptions self() {
        return this;
    }
}
