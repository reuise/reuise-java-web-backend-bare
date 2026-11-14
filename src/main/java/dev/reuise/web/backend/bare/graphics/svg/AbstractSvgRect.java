package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.DefaultWebBackendSvgRect;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgRect;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgRectPart;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgRectPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSvgRect<S extends AbstractSvgRect<S, O>, O extends AbstractSvgRectOptions<?>> extends DefaultWebBackendSvgRect<S, O> implements WebBackendComponentPart , BareWebSvgRect {
    protected final BareWebSvgRectPart barePart;

    protected AbstractSvgRect(O options) {
        super(options);
        barePart = new DefaultBareWebSvgRectPart(options);
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
