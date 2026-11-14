package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableBody extends AbstractTableBody<TableBody, TableBodyOptions> {
    public TableBody() {
        this(createOptions());
    }

    public TableBody(TableBodyOptions options) {
        super(options);
    }

    public static TableBodyOptions createOptions() {
        return new TableBodyOptions();
    }

    public static TableBody create(TableBodyOptions options) {
        return new TableBody(options);
    }

    public static TableBody create(WebBackendParentComponentOptions options) {
        return create(new TableBodyOptions(options));
    }

    public static TableBody create() {
        return new TableBody();
    }

    @Override
    protected TableBody self() {
        return this;
    }
}
