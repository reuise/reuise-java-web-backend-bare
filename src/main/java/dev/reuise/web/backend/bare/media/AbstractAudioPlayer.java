package dev.reuise.web.backend.bare.media;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.media.DefaultWebBackendAudioPlayer;
import dev.reuise.web.core.bare.media.BareWebAudioPlayer;
import dev.reuise.web.core.bare.media.BareWebAudioPlayerPart;
import dev.reuise.web.core.bare.media.DefaultBareWebAudioPlayerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractAudioPlayer<S extends AbstractAudioPlayer<S, O>, O extends AbstractAudioPlayerOptions<?>> extends DefaultWebBackendAudioPlayer<S, O> implements WebBackendComponentPart , BareWebAudioPlayer {
    protected final BareWebAudioPlayerPart barePart;

    protected AbstractAudioPlayer(O options) {
        super(options);
        barePart = new DefaultBareWebAudioPlayerPart(options);
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
