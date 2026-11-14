package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendRotatingText;
import dev.reuise.web.core.bare.text.BareWebRotatingText;
import dev.reuise.web.core.bare.text.BareWebRotatingTextPart;
import dev.reuise.web.core.bare.text.DefaultBareWebRotatingTextPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractRotatingText<S extends AbstractRotatingText<S, O>, O extends AbstractRotatingTextOptions<?>> extends DefaultWebBackendRotatingText<S, O> implements BareWebRotatingText , WebBackendComponentPart {
    protected final BareWebRotatingTextPart barePart;

    protected AbstractRotatingText(O options) {
        super(options);
        barePart = new DefaultBareWebRotatingTextPart(options);
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
