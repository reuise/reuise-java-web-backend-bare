package dev.reuise.web.backend.bare.slidecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.slidecontainer.DefaultWebBackendSlideContainer;
import dev.reuise.web.core.bare.slidecontainer.BareWebSlideContainer;
import dev.reuise.web.core.bare.slidecontainer.BareWebSlideContainerPart;
import dev.reuise.web.core.bare.slidecontainer.DefaultBareWebSlideContainerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSlideContainer<S extends AbstractSlideContainer<S, O>, O extends AbstractSlideContainerOptions<?>> extends DefaultWebBackendSlideContainer<S, O> implements BareWebSlideContainer , WebBackendComponentPart {
    protected final BareWebSlideContainerPart barePart;

    protected AbstractSlideContainer(O options) {
        super(options);
        barePart = new DefaultBareWebSlideContainerPart(options);
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
