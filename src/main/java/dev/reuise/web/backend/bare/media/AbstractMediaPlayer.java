package dev.reuise.web.backend.bare.media;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.media.DefaultWebBackendMediaPlayer;
import dev.reuise.web.core.bare.media.BareWebMediaPlayer;
import dev.reuise.web.core.bare.media.BareWebMediaPlayerPart;
import dev.reuise.web.core.bare.media.DefaultBareWebMediaPlayerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractMediaPlayer<S extends AbstractMediaPlayer<S, O>, O extends AbstractMediaPlayerOptions<?>> extends DefaultWebBackendMediaPlayer<S, O> implements WebBackendComponentPart , BareWebMediaPlayer {
    protected final BareWebMediaPlayerPart barePart;

    protected AbstractMediaPlayer(O options) {
        super(options);
        barePart = new DefaultBareWebMediaPlayerPart(options);
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
