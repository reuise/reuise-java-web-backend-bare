package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableFooter extends AbstractTableFooter<TableFooter, TableFooterOptions> {
    public TableFooter() {
        this(createOptions());
    }

    public TableFooter(TableFooterOptions options) {
        super(options);
    }

    public static TableFooterOptions createOptions() {
        return new TableFooterOptions();
    }

    public static TableFooter create(TableFooterOptions options) {
        return new TableFooter(options);
    }

    public static TableFooter create(WebBackendParentComponentOptions options) {
        return create(new TableFooterOptions(options));
    }

    public static TableFooter create() {
        return new TableFooter();
    }

    @Override
    protected TableFooter self() {
        return this;
    }
}
