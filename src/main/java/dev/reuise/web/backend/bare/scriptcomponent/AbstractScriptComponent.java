package dev.reuise.web.backend.bare.scriptcomponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.scriptcomponent.DefaultWebBackendScriptComponent;
import dev.reuise.web.core.bare.scriptcomponent.BareWebScriptComponent;
import dev.reuise.web.core.bare.scriptcomponent.BareWebScriptComponentPart;
import dev.reuise.web.core.bare.scriptcomponent.DefaultBareWebScriptComponentPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractScriptComponent<S extends AbstractScriptComponent<S, O>, O extends AbstractScriptComponentOptions<?>> extends DefaultWebBackendScriptComponent<S, O> implements BareWebScriptComponent , WebBackendComponentPart {
    protected final BareWebScriptComponentPart barePart;

    protected AbstractScriptComponent(O options) {
        super(options);
        barePart = new DefaultBareWebScriptComponentPart(options);
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
