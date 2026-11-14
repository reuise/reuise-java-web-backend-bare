package dev.reuise.web.backend.bare.layout;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.DefaultWebBackendSurface;
import dev.reuise.web.core.bare.layout.BareWebSurface;
import dev.reuise.web.core.bare.layout.BareWebSurfacePart;
import dev.reuise.web.core.bare.layout.DefaultBareWebSurfacePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSurface<S extends AbstractSurface<S, O>, O extends AbstractSurfaceOptions<?>> extends DefaultWebBackendSurface<S, O> implements WebBackendComponentPart , BareWebSurface {
    protected final BareWebSurfacePart barePart;

    protected AbstractSurface(O options) {
        super(options);
        barePart = new DefaultBareWebSurfacePart(options);
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
