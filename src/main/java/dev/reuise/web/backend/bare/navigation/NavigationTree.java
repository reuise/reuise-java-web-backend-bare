package dev.reuise.web.backend.bare.navigation;
import dev.reuise.web.backend.accordion.WebBackendAccordionOptions;
public class NavigationTree extends AbstractNavigationTree<NavigationTree, NavigationTreeOptions> {
    public NavigationTree() {
        this(createOptions());
    }

    public NavigationTree(NavigationTreeOptions options) {
        super(options);
    }

    public static NavigationTreeOptions createOptions() {
        return new NavigationTreeOptions();
    }

    public static NavigationTree create(NavigationTreeOptions options) {
        return new NavigationTree(options);
    }

    public static NavigationTree create(WebBackendAccordionOptions options) {
        return create(new NavigationTreeOptions(options));
    }

    public static NavigationTree create() {
        return new NavigationTree();
    }

    @Override
    protected NavigationTree self() {
        return this;
    }
}
