package dev.reuise.web.backend.bare.view;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.view.DefaultWebBackendSheetView;
import dev.reuise.web.core.bare.view.BareWebSheetView;
import dev.reuise.web.core.bare.view.BareWebSheetViewPart;
import dev.reuise.web.core.bare.view.DefaultBareWebSheetViewPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSheetView<S extends AbstractSheetView<S, O>, O extends AbstractSheetViewOptions<?>> extends DefaultWebBackendSheetView<S, O> implements BareWebSheetView , WebBackendComponentPart {
    protected final BareWebSheetViewPart barePart;

    protected AbstractSheetView(O options) {
        super(options);
        barePart = new DefaultBareWebSheetViewPart(options);
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
