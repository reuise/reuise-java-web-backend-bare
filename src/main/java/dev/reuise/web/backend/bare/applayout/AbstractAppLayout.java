package dev.reuise.web.backend.bare.applayout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.applayout.DefaultWebBackendAppLayout;
import dev.reuise.web.core.bare.applayout.BareWebAppLayout;
import dev.reuise.web.core.bare.applayout.BareWebAppLayoutPart;
import dev.reuise.web.core.bare.applayout.DefaultBareWebAppLayoutPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractAppLayout<S extends AbstractAppLayout<S, O>, O extends AbstractAppLayoutOptions<?>> extends DefaultWebBackendAppLayout<S, O> implements BareWebAppLayout , WebBackendComponentPart {
    protected final BareWebAppLayoutPart barePart;

    protected AbstractAppLayout(O options) {
        super(options);
        barePart = new DefaultBareWebAppLayoutPart(options);
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
