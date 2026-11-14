package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableHeaderOptions extends AbstractTableHeaderOptions<TableHeaderOptions> {
    public TableHeaderOptions() {
    }

    public TableHeaderOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableHeaderOptions self() {
        return this;
    }
}
