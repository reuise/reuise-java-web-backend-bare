package dev.reuise.web.backend.bare.scrollablecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.scrollablecontainer.DefaultWebBackendScrollableContainerScrollArea;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerScrollArea;
import dev.reuise.web.core.bare.scrollablecontainer.BareWebScrollableContainerScrollAreaPart;
import dev.reuise.web.core.bare.scrollablecontainer.DefaultBareWebScrollableContainerScrollAreaPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractScrollableContainerScrollArea<S extends AbstractScrollableContainerScrollArea<S, O>, O extends AbstractScrollableContainerScrollAreaOptions<?>> extends DefaultWebBackendScrollableContainerScrollArea<S, O> implements BareWebScrollableContainerScrollArea , WebBackendComponentPart {
    protected final BareWebScrollableContainerScrollAreaPart barePart;

    protected AbstractScrollableContainerScrollArea(O options) {
        super(options);
        barePart = new DefaultBareWebScrollableContainerScrollAreaPart(options);
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
