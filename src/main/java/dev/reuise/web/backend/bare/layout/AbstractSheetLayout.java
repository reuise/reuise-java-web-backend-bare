package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.DefaultWebBackendSheetLayout;
import dev.reuise.web.core.bare.layout.BareWebSheetLayout;
import dev.reuise.web.core.bare.layout.BareWebSheetLayoutPart;
import dev.reuise.web.core.bare.layout.DefaultBareWebSheetLayoutPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSheetLayout<S extends AbstractSheetLayout<S, O>, O extends AbstractSheetLayoutOptions<?>> extends DefaultWebBackendSheetLayout<S, O> implements WebBackendComponentPart , BareWebSheetLayout {
    protected final BareWebSheetLayoutPart barePart;

    protected AbstractSheetLayout(O options) {
        super(options);
        barePart = new DefaultBareWebSheetLayoutPart(options);
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
