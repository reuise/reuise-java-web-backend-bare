package dev.reuise.web.backend.bare.progressindicator;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.progressindicator.DefaultWebBackendProgressIndicator;
import dev.reuise.web.core.bare.progressindicator.BareWebProgressIndicator;
import dev.reuise.web.core.bare.progressindicator.BareWebProgressIndicatorPart;
import dev.reuise.web.core.bare.progressindicator.DefaultBareWebProgressIndicatorPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractProgressIndicator<S extends AbstractProgressIndicator<S, O>, O extends AbstractProgressIndicatorOptions<?>> extends DefaultWebBackendProgressIndicator<S, O> implements BareWebProgressIndicator , WebBackendComponentPart {
    protected final BareWebProgressIndicatorPart barePart;

    protected AbstractProgressIndicator(O options) {
        super(options);
        barePart = new DefaultBareWebProgressIndicatorPart(options);
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
