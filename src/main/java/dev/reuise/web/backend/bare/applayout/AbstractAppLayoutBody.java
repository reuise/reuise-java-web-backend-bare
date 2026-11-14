package dev.reuise.web.backend.bare.applayout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.applayout.DefaultWebBackendAppLayoutBody;
import dev.reuise.web.core.bare.applayout.BareWebAppLayoutBody;
import dev.reuise.web.core.bare.applayout.BareWebAppLayoutBodyPart;
import dev.reuise.web.core.bare.applayout.DefaultBareWebAppLayoutBodyPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractAppLayoutBody<S extends AbstractAppLayoutBody<S, O>, O extends AbstractAppLayoutBodyOptions<?>> extends DefaultWebBackendAppLayoutBody<S, O> implements WebBackendComponentPart , BareWebAppLayoutBody {
    protected final BareWebAppLayoutBodyPart barePart;

    protected AbstractAppLayoutBody(O options) {
        super(options);
        barePart = new DefaultBareWebAppLayoutBodyPart(options);
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
