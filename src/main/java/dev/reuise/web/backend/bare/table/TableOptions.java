package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableOptions extends AbstractTableOptions<TableOptions> {
    public TableOptions() {
    }

    public TableOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableOptions self() {
        return this;
    }
}
