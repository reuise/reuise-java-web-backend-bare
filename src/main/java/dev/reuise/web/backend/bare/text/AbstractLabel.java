package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendLabel;
import dev.reuise.web.core.bare.text.BareWebLabel;
import dev.reuise.web.core.bare.text.BareWebLabelPart;
import dev.reuise.web.core.bare.text.DefaultBareWebLabelPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractLabel<S extends AbstractLabel<S, O>, O extends AbstractLabelOptions<?>> extends DefaultWebBackendLabel<S, O> implements BareWebLabel , WebBackendComponentPart {
    protected final BareWebLabelPart barePart;

    protected AbstractLabel(O options) {
        super(options);
        barePart = new DefaultBareWebLabelPart(options);
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
