package dev.reuise.web.backend.bare.table;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TableColumnGroup extends AbstractTableColumnGroup<TableColumnGroup, TableColumnGroupOptions> {
    public TableColumnGroup() {
        this(createOptions());
    }

    public TableColumnGroup(TableColumnGroupOptions options) {
        super(options);
    }

    public static TableColumnGroupOptions createOptions() {
        return new TableColumnGroupOptions();
    }

    public static TableColumnGroup create(TableColumnGroupOptions options) {
        return new TableColumnGroup(options);
    }

    public static TableColumnGroup create(WebBackendParentComponentOptions options) {
        return create(new TableColumnGroupOptions(options));
    }

    public static TableColumnGroup create() {
        return new TableColumnGroup();
    }

    @Override
    protected TableColumnGroup self() {
        return this;
    }
}
