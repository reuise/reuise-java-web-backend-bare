package dev.reuise.web.backend.bare.floating;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.floating.DefaultWebBackendFloatingActionButton;
import dev.reuise.web.core.bare.floating.BareWebFloatingActionButton;
import dev.reuise.web.core.bare.floating.BareWebFloatingActionButtonPart;
import dev.reuise.web.core.bare.floating.DefaultBareWebFloatingActionButtonPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractFloatingActionButton<S extends AbstractFloatingActionButton<S, O>, O extends AbstractFloatingActionButtonOptions<?>> extends DefaultWebBackendFloatingActionButton<S, O> implements WebBackendComponentPart , BareWebFloatingActionButton {
    protected final BareWebFloatingActionButtonPart barePart;

    protected AbstractFloatingActionButton(O options) {
        super(options);
        barePart = new DefaultBareWebFloatingActionButtonPart(options);
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
