package dev.reuise.web.backend.bare.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.media.AbstractWebBackendMediaPlayerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.media.BareWebMediaPlayerPartOptions;
import dev.reuise.web.core.bare.media.DefaultBareWebMediaPlayerOptions;
public abstract class AbstractMediaPlayerOptions<S extends AbstractMediaPlayerOptions<S>> extends AbstractWebBackendMediaPlayerOptions<S> implements BareWebMediaPlayerPartOptions {
    protected final BareWebMediaPlayerPartOptions barePart;

    protected AbstractMediaPlayerOptions() {
        this(null);
    }

    protected AbstractMediaPlayerOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebMediaPlayerOptions();
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
