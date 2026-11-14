package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ListViewOptions extends AbstractListViewOptions<ListViewOptions> {
    public ListViewOptions() {
    }

    public ListViewOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ListViewOptions self() {
        return this;
    }
}
