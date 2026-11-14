package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.slidecontainer.DefaultWebBackendSlideContainerEdge;
import dev.reuise.web.core.bare.slidecontainer.BareWebSlideContainerEdge;
import dev.reuise.web.core.bare.slidecontainer.BareWebSlideContainerEdgePart;
import dev.reuise.web.core.bare.slidecontainer.DefaultBareWebSlideContainerEdgePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSlideContainerEdge<S extends AbstractSlideContainerEdge<S, O>, O extends AbstractSlideContainerEdgeOptions<?>> extends DefaultWebBackendSlideContainerEdge<S, O> implements WebBackendComponentPart , BareWebSlideContainerEdge {
    protected final BareWebSlideContainerEdgePart barePart;

    protected AbstractSlideContainerEdge(O options) {
        super(options);
        barePart = new DefaultBareWebSlideContainerEdgePart(options);
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
