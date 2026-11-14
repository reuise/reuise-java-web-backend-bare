package dev.reuise.web.backend.bare.topappbar;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.topappbar.DefaultWebBackendTopAppBar;
import dev.reuise.web.core.bare.topappbar.BareWebTopAppBar;
import dev.reuise.web.core.bare.topappbar.BareWebTopAppBarPart;
import dev.reuise.web.core.bare.topappbar.DefaultBareWebTopAppBarPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTopAppBar<S extends AbstractTopAppBar<S, O>, O extends AbstractTopAppBarOptions<?>> extends DefaultWebBackendTopAppBar<S, O> implements WebBackendComponentPart , BareWebTopAppBar {
    protected final BareWebTopAppBarPart barePart;

    protected AbstractTopAppBar(O options) {
        super(options);
        barePart = new DefaultBareWebTopAppBarPart(options);
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
