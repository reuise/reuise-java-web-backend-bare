package dev.reuise.web.backend.bare.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.media.AbstractWebBackendVideoPlayerOptions;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
import dev.reuise.web.core.bare.media.BareWebVideoPlayerPartOptions;
import dev.reuise.web.core.bare.media.DefaultBareWebVideoPlayerOptions;
public abstract class AbstractVideoPlayerOptions<S extends AbstractVideoPlayerOptions<S>> extends AbstractWebBackendVideoPlayerOptions<S> implements BareWebVideoPlayerPartOptions {
    protected final BareWebVideoPlayerPartOptions barePart;

    protected AbstractVideoPlayerOptions() {
        this(null);
    }

    protected AbstractVideoPlayerOptions(WebBackendMediaPlayerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebVideoPlayerOptions();
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
