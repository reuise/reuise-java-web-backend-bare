package dev.reuise.web.backend.bare.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.media.AbstractWebBackendAudioPlayerOptions;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
import dev.reuise.web.core.bare.media.BareWebAudioPlayerPartOptions;
import dev.reuise.web.core.bare.media.DefaultBareWebAudioPlayerOptions;
public abstract class AbstractAudioPlayerOptions<S extends AbstractAudioPlayerOptions<S>> extends AbstractWebBackendAudioPlayerOptions<S> implements BareWebAudioPlayerPartOptions {
    protected final BareWebAudioPlayerPartOptions barePart;

    protected AbstractAudioPlayerOptions() {
        this(null);
    }

    protected AbstractAudioPlayerOptions(WebBackendMediaPlayerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebAudioPlayerOptions();
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
