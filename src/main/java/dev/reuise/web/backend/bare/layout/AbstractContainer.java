package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.DefaultWebBackendContainer;
import dev.reuise.web.core.bare.layout.BareWebContainer;
import dev.reuise.web.core.bare.layout.BareWebContainerPart;
import dev.reuise.web.core.bare.layout.DefaultBareWebContainerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractContainer<S extends AbstractContainer<S, O>, O extends AbstractContainerOptions<?>> extends DefaultWebBackendContainer<S, O> implements WebBackendComponentPart , BareWebContainer {
    protected final BareWebContainerPart barePart;

    protected AbstractContainer(O options) {
        super(options);
        barePart = new DefaultBareWebContainerPart(options);
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
