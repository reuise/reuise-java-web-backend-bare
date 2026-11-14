package dev.reuise.web.backend.bare.regionselector;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.regionselector.DefaultWebBackendRegionSelector;
import dev.reuise.web.core.bare.regionselector.BareWebRegionSelector;
import dev.reuise.web.core.bare.regionselector.BareWebRegionSelectorPart;
import dev.reuise.web.core.bare.regionselector.DefaultBareWebRegionSelectorPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractRegionSelector<S extends AbstractRegionSelector<S, O>, O extends AbstractRegionSelectorOptions<?>> extends DefaultWebBackendRegionSelector<S, O> implements WebBackendComponentPart , BareWebRegionSelector {
    protected final BareWebRegionSelectorPart barePart;

    protected AbstractRegionSelector(O options) {
        super(options);
        barePart = new DefaultBareWebRegionSelectorPart(options);
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
