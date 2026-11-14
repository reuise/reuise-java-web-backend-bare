package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableHeaderRowOptions extends AbstractTableHeaderRowOptions<TableHeaderRowOptions> {
    public TableHeaderRowOptions() {
    }

    public TableHeaderRowOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableHeaderRowOptions self() {
        return this;
    }
}
