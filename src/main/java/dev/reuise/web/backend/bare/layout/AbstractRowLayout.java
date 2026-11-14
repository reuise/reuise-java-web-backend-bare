package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.DefaultWebBackendRowLayout;
import dev.reuise.web.core.bare.layout.BareWebRowLayout;
import dev.reuise.web.core.bare.layout.BareWebRowLayoutPart;
import dev.reuise.web.core.bare.layout.DefaultBareWebRowLayoutPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractRowLayout<S extends AbstractRowLayout<S, O>, O extends AbstractRowLayoutOptions<?>> extends DefaultWebBackendRowLayout<S, O> implements WebBackendComponentPart , BareWebRowLayout {
    protected final BareWebRowLayoutPart barePart;

    protected AbstractRowLayout(O options) {
        super(options);
        barePart = new DefaultBareWebRowLayoutPart(options);
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
