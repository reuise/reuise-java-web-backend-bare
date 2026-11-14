package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.list.WebBackendBasicListItemOptions;
public class ListItem extends AbstractListItem<ListItem, ListItemOptions> {
    public ListItem() {
        this(createOptions());
    }

    public ListItem(ListItemOptions options) {
        super(options);
    }

    public static ListItemOptions createOptions() {
        return new ListItemOptions();
    }

    public static ListItem create(ListItemOptions options) {
        return new ListItem(options);
    }

    public static ListItem create(WebBackendBasicListItemOptions options) {
        return create(new ListItemOptions(options));
    }

    public static ListItem create() {
        return new ListItem();
    }

    @Override
    protected ListItem self() {
        return this;
    }
}
