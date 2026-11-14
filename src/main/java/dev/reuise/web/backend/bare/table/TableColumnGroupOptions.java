package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableColumnGroupOptions extends AbstractTableColumnGroupOptions<TableColumnGroupOptions> {
    public TableColumnGroupOptions() {
    }

    public TableColumnGroupOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableColumnGroupOptions self() {
        return this;
    }
}
