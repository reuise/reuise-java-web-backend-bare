package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.DefaultWebBackendSvgGroup;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgGroup;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgGroupPart;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgGroupPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSvgGroup<S extends AbstractSvgGroup<S, O>, O extends AbstractSvgGroupOptions<?>> extends DefaultWebBackendSvgGroup<S, O> implements WebBackendComponentPart , BareWebSvgGroup {
    protected final BareWebSvgGroupPart barePart;

    protected AbstractSvgGroup(O options) {
        super(options);
        barePart = new DefaultBareWebSvgGroupPart(options);
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
