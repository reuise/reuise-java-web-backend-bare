package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.DefaultWebBackendColumnLayout;
import dev.reuise.web.core.bare.layout.BareWebColumnLayout;
import dev.reuise.web.core.bare.layout.BareWebColumnLayoutPart;
import dev.reuise.web.core.bare.layout.DefaultBareWebColumnLayoutPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractColumnLayout<S extends AbstractColumnLayout<S, O>, O extends AbstractColumnLayoutOptions<?>> extends DefaultWebBackendColumnLayout<S, O> implements WebBackendComponentPart , BareWebColumnLayout {
    protected final BareWebColumnLayoutPart barePart;

    protected AbstractColumnLayout(O options) {
        super(options);
        barePart = new DefaultBareWebColumnLayoutPart(options);
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
