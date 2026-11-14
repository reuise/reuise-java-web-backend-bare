package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.scrollablecontainer.DefaultWebBackendScrollableContainerEdge;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerEdge;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerEdgePart;
import dev.reuise.web.core.bare.scrollablecontainer.DefaultBareWebScrollableContainerEdgePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractScrollableContainerEdge<S extends AbstractScrollableContainerEdge<S, O>, O extends AbstractScrollableContainerEdgeOptions<?>> extends DefaultWebBackendScrollableContainerEdge<S, O> implements WebBackendComponentPart , BareWebScrollableContainerEdge {
    protected final BareWebScrollableContainerEdgePart barePart;

    protected AbstractScrollableContainerEdge(O options) {
        super(options);
        barePart = new DefaultBareWebScrollableContainerEdgePart(options);
        if (options == null)
            return;

        // addPart(ComponentPart.Type.DESIGN, barePart)
        initialize(self(), options);
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}
