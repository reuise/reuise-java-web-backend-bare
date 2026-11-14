package dev.reuise.web.backend.bare.card;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.card.DefaultWebBackendCardGrid;
import dev.reuise.web.core.bare.card.BareWebCardGrid;
import dev.reuise.web.core.bare.card.BareWebCardGridPart;
import dev.reuise.web.core.bare.card.DefaultBareWebCardGridPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCardGrid<S extends AbstractCardGrid<S, O>, O extends AbstractCardGridOptions<?>> extends DefaultWebBackendCardGrid<S, O> implements BareWebCardGrid , WebBackendComponentPart {
    protected final BareWebCardGridPart barePart;

    protected AbstractCardGrid(O options) {
        super(options);
        barePart = new DefaultBareWebCardGridPart(options);
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
