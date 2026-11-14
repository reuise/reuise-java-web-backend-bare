package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableBodyOptions extends AbstractTableBodyOptions<TableBodyOptions> {
    public TableBodyOptions() {
    }

    public TableBodyOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableBodyOptions self() {
        return this;
    }
}
