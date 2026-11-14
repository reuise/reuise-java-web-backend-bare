package dev.reuise.web.backend.bare.basecomponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.DefaultWebBackendBaseComponent;
import dev.reuise.web.core.bare.basecomponent.BareWebBaseComponent;
import dev.reuise.web.core.bare.basecomponent.BareWebBaseComponentPart;
import dev.reuise.web.core.bare.basecomponent.DefaultBareWebBaseComponentPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractBaseComponent<S extends AbstractBaseComponent<S, O>, O extends AbstractBaseComponentOptions<?>> extends DefaultWebBackendBaseComponent<S, O> implements WebBackendComponentPart , BareWebBaseComponent {
    protected final BareWebBaseComponentPart barePart;

    protected AbstractBaseComponent(O options) {
        super(options);
        barePart = new DefaultBareWebBaseComponentPart(options);
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
