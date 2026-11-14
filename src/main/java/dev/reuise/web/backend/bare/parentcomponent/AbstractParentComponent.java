package dev.reuise.web.backend.bare.parentcomponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.DefaultWebBackendParentComponent;
import dev.reuise.web.core.bare.parentcomponent.BareWebParentComponent;
import dev.reuise.web.core.bare.parentcomponent.BareWebParentComponentPart;
import dev.reuise.web.core.bare.parentcomponent.DefaultBareWebParentComponentPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractParentComponent<S extends AbstractParentComponent<S, O>, O extends AbstractParentComponentOptions<?>> extends DefaultWebBackendParentComponent<S, O> implements WebBackendComponentPart , BareWebParentComponent {
    protected final BareWebParentComponentPart barePart;

    protected AbstractParentComponent(O options) {
        super(options);
        barePart = new DefaultBareWebParentComponentPart(options);
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
