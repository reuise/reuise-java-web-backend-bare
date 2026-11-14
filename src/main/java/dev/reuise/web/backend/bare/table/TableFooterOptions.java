package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableFooterOptions extends AbstractTableFooterOptions<TableFooterOptions> {
    public TableFooterOptions() {
    }

    public TableFooterOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TableFooterOptions self() {
        return this;
    }
}
