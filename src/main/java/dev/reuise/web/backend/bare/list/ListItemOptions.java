package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.list.WebBackendBasicListItemOptions;
public class ListItemOptions extends AbstractListItemOptions<ListItemOptions> {
    public ListItemOptions() {
    }

    public ListItemOptions(WebBackendBasicListItemOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ListItemOptions self() {
        return this;
    }
}
