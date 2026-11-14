package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.DefaultWebBackendSvgPath;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgPath;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgPathPart;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgPathPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSvgPath<S extends AbstractSvgPath<S, O>, O extends AbstractSvgPathOptions<?>> extends DefaultWebBackendSvgPath<S, O> implements WebBackendComponentPart , BareWebSvgPath {
    protected final BareWebSvgPathPart barePart;

    protected AbstractSvgPath(O options) {
        super(options);
        barePart = new DefaultBareWebSvgPathPart(options);
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
