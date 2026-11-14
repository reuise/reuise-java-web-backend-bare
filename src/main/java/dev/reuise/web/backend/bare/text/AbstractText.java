package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendText;
import dev.reuise.web.core.bare.text.BareWebText;
import dev.reuise.web.core.bare.text.BareWebTextPart;
import dev.reuise.web.core.bare.text.DefaultBareWebTextPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractText<S extends AbstractText<S, O>, O extends AbstractTextOptions<?>> extends DefaultWebBackendText<S, O> implements BareWebText , WebBackendComponentPart {
    protected final BareWebTextPart barePart;

    protected AbstractText(O options) {
        super(options);
        barePart = new DefaultBareWebTextPart(options);
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
