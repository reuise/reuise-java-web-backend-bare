package dev.reuise.web.backend.bare.avatar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.avatar.AbstractWebBackendAvatarOptions;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.avatar.BareWebAvatarPartOptions;
import dev.reuise.web.core.bare.avatar.DefaultBareWebAvatarOptions;
public abstract class AbstractAvatarOptions<S extends AbstractAvatarOptions<S>> extends AbstractWebBackendAvatarOptions<S> implements BareWebAvatarPartOptions {
    protected final BareWebAvatarPartOptions barePart;

    protected AbstractAvatarOptions() {
        this(null);
    }

    protected AbstractAvatarOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebAvatarOptions();
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
