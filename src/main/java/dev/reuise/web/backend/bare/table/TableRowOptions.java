package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableRowOptions extends AbstractTableRowOptions<TableRowOptions> {
    public TableRowOptions() {
    }

    public TableRowOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableRowOptions self() {
        return this;
    }
}
