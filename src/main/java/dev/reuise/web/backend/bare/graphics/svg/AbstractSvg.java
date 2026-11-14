package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.DefaultWebBackendSvg;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvg;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgPart;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSvg<S extends AbstractSvg<S, O>, O extends AbstractSvgOptions<?>> extends DefaultWebBackendSvg<S, O> implements BareWebSvg , WebBackendComponentPart {
    protected final BareWebSvgPart barePart;

    protected AbstractSvg(O options) {
        super(options);
        barePart = new DefaultBareWebSvgPart(options);
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
