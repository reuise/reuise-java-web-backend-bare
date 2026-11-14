package dev.reuise.web.backend.bare.media;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.media.DefaultWebBackendVideoPlayer;
import dev.reuise.web.core.bare.media.BareWebVideoPlayer;
import dev.reuise.web.core.bare.media.BareWebVideoPlayerPart;
import dev.reuise.web.core.bare.media.DefaultBareWebVideoPlayerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractVideoPlayer<S extends AbstractVideoPlayer<S, O>, O extends AbstractVideoPlayerOptions<?>> extends DefaultWebBackendVideoPlayer<S, O> implements BareWebVideoPlayer , WebBackendComponentPart {
    protected final BareWebVideoPlayerPart barePart;

    protected AbstractVideoPlayer(O options) {
        super(options);
        barePart = new DefaultBareWebVideoPlayerPart(options);
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
