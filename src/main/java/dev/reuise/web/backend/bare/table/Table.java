package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Table extends AbstractTable<Table, TableOptions> {
    public Table() {
        this(createOptions());
    }

    public Table(TableOptions options) {
        super(options);
    }

    public static TableOptions createOptions() {
        return new TableOptions();
    }

    public static Table create(TableOptions options) {
        return new Table(options);
    }

    public static Table create(WebBackendParentComponentOptions options) {
        return create(new TableOptions(options));
    }

    public static Table create() {
        return new Table();
    }

    @Override
    protected Table self() {
        return this;
    }
}
