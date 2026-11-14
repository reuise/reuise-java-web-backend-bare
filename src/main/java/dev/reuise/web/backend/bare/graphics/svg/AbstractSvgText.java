package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.DefaultWebBackendSvgText;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgText;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgTextPart;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgTextPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSvgText<S extends AbstractSvgText<S, O>, O extends AbstractSvgTextOptions<?>> extends DefaultWebBackendSvgText<S, O> implements WebBackendComponentPart , BareWebSvgText {
    protected final BareWebSvgTextPart barePart;

    protected AbstractSvgText(O options) {
        super(options);
        barePart = new DefaultBareWebSvgTextPart(options);
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
