package dev.reuise.web.backend.bare.skeleton;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.skeleton.AbstractWebBackendSkeletonOptions;
import dev.reuise.web.core.bare.skeleton.BareWebSkeletonPartOptions;
import dev.reuise.web.core.bare.skeleton.DefaultBareWebSkeletonOptions;
public abstract class AbstractSkeletonOptions<S extends AbstractSkeletonOptions<S>> extends AbstractWebBackendSkeletonOptions<S> implements BareWebSkeletonPartOptions {
    protected final BareWebSkeletonPartOptions barePart;

    protected AbstractSkeletonOptions() {
        this(null);
    }

    protected AbstractSkeletonOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSkeletonOptions();
        ((BaseComponentOptions) (getBaseComponentPart())).initialize(this);
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    public WebBackendComponentFactory getComponentFactory() {
        return DefaultComponentFactory.get();
    }
}
