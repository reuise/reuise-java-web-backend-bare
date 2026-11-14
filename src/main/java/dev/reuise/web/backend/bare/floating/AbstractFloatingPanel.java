package dev.reuise.web.backend.bare.floating;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.floating.DefaultWebBackendFloatingPanel;
import dev.reuise.web.core.bare.floating.BareWebFloatingPanel;
import dev.reuise.web.core.bare.floating.BareWebFloatingPanelPart;
import dev.reuise.web.core.bare.floating.DefaultBareWebFloatingPanelPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractFloatingPanel<S extends AbstractFloatingPanel<S, O>, O extends AbstractFloatingPanelOptions<?>> extends DefaultWebBackendFloatingPanel<S, O> implements WebBackendComponentPart , BareWebFloatingPanel {
    protected final BareWebFloatingPanelPart barePart;

    protected AbstractFloatingPanel(O options) {
        super(options);
        barePart = new DefaultBareWebFloatingPanelPart(options);
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
