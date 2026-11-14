package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class BasicListItem extends AbstractBasicListItem<BasicListItem, BasicListItemOptions> {
    public BasicListItem() {
        this(createOptions());
    }

    public BasicListItem(BasicListItemOptions options) {
        super(options);
    }

    public static BasicListItemOptions createOptions() {
        return new BasicListItemOptions();
    }

    public static BasicListItem create(BasicListItemOptions options) {
        return new BasicListItem(options);
    }

    public static BasicListItem create(WebBackendParentComponentOptions options) {
        return create(new BasicListItemOptions(options));
    }

    public static BasicListItem create() {
        return new BasicListItem();
    }

    @Override
    protected BasicListItem self() {
        return this;
    }
}
