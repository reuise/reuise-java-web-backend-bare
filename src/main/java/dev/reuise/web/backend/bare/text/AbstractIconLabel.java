package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendIconLabel;
import dev.reuise.web.core.bare.text.BareWebIconLabel;
import dev.reuise.web.core.bare.text.BareWebIconLabelPart;
import dev.reuise.web.core.bare.text.DefaultBareWebIconLabelPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractIconLabel<S extends AbstractIconLabel<S, O>, O extends AbstractIconLabelOptions<?>> extends DefaultWebBackendIconLabel<S, O> implements BareWebIconLabel , WebBackendComponentPart {
    protected final BareWebIconLabelPart barePart;

    protected AbstractIconLabel(O options) {
        super(options);
        barePart = new DefaultBareWebIconLabelPart(options);
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
