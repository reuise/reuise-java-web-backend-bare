package dev.reuise.web.backend.bare.bottomappbar;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.bottomappbar.DefaultWebBackendBottomAppBar;
import dev.reuise.web.core.bare.bottomappbar.BareWebBottomAppBar;
import dev.reuise.web.core.bare.bottomappbar.BareWebBottomAppBarPart;
import dev.reuise.web.core.bare.bottomappbar.DefaultBareWebBottomAppBarPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractBottomAppBar<S extends AbstractBottomAppBar<S, O>, O extends AbstractBottomAppBarOptions<?>> extends DefaultWebBackendBottomAppBar<S, O> implements BareWebBottomAppBar , WebBackendComponentPart {
    protected final BareWebBottomAppBarPart barePart;

    protected AbstractBottomAppBar(O options) {
        super(options);
        barePart = new DefaultBareWebBottomAppBarPart(options);
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
