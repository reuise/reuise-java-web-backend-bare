package dev.reuise.web.backend.bare.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.media.AbstractWebBackendTextTrackOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.media.BareWebTextTrackPartOptions;
import dev.reuise.web.core.bare.media.DefaultBareWebTextTrackOptions;
public abstract class AbstractTextTrackOptions<S extends AbstractTextTrackOptions<S>> extends AbstractWebBackendTextTrackOptions<S> implements BareWebTextTrackPartOptions {
    protected final BareWebTextTrackPartOptions barePart;

    protected AbstractTextTrackOptions() {
        this(null);
    }

    protected AbstractTextTrackOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTextTrackOptions();
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
