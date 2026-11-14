package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableHeader extends AbstractTableHeader<TableHeader, TableHeaderOptions> {
    public TableHeader() {
        this(createOptions());
    }

    public TableHeader(TableHeaderOptions options) {
        super(options);
    }

    public static TableHeaderOptions createOptions() {
        return new TableHeaderOptions();
    }

    public static TableHeader create(TableHeaderOptions options) {
        return new TableHeader(options);
    }

    public static TableHeader create(WebBackendParentComponentOptions options) {
        return create(new TableHeaderOptions(options));
    }

    public static TableHeader create() {
        return new TableHeader();
    }

    @Override
    protected TableHeader self() {
        return this;
    }
}
