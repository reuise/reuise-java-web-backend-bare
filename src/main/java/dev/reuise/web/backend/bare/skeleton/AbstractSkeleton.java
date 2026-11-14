package dev.reuise.web.backend.bare.skeleton;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.skeleton.DefaultWebBackendSkeleton;
import dev.reuise.web.core.bare.skeleton.BareWebSkeleton;
import dev.reuise.web.core.bare.skeleton.BareWebSkeletonPart;
import dev.reuise.web.core.bare.skeleton.DefaultBareWebSkeletonPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSkeleton<S extends AbstractSkeleton<S, O>, O extends AbstractSkeletonOptions<?>> extends DefaultWebBackendSkeleton<S, O> implements WebBackendComponentPart , BareWebSkeleton {
    protected final BareWebSkeletonPart barePart;

    protected AbstractSkeleton(O options) {
        super(options);
        barePart = new DefaultBareWebSkeletonPart(options);
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
