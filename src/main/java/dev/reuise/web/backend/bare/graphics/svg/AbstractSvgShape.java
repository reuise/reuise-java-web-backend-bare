package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.DefaultWebBackendSvgShape;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgShape;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgShapePart;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgShapePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSvgShape<S extends AbstractSvgShape<S, O>, O extends AbstractSvgShapeOptions<?>> extends DefaultWebBackendSvgShape<S, O> implements BareWebSvgShape , WebBackendComponentPart {
    protected final BareWebSvgShapePart barePart;

    protected AbstractSvgShape(O options) {
        super(options);
        barePart = new DefaultBareWebSvgShapePart(options);
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
