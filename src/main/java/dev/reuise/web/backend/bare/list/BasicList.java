package dev.reuise.web.backend.bare.list;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class BasicList extends AbstractBasicList<BasicList, BasicListOptions> {
    public BasicList() {
        this(createOptions());
    }

    public BasicList(BasicListOptions options) {
        super(options);
    }

    public static BasicListOptions createOptions() {
        return new BasicListOptions();
    }

    public static BasicList create(BasicListOptions options) {
        return new BasicList(options);
    }

    public static BasicList create(WebBackendParentComponentOptions options) {
        return create(new BasicListOptions(options));
    }

    public static BasicList create() {
        return new BasicList();
    }

    @Override
    protected BasicList self() {
        return this;
    }
}
