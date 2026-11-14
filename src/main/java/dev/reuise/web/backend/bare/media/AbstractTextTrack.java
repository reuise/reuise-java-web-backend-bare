package dev.reuise.web.backend.bare.media;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.media.DefaultWebBackendTextTrack;
import dev.reuise.web.core.bare.media.BareWebTextTrack;
import dev.reuise.web.core.bare.media.BareWebTextTrackPart;
import dev.reuise.web.core.bare.media.DefaultBareWebTextTrackPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTextTrack<S extends AbstractTextTrack<S, O>, O extends AbstractTextTrackOptions<?>> extends DefaultWebBackendTextTrack<S, O> implements WebBackendComponentPart , BareWebTextTrack {
    protected final BareWebTextTrackPart barePart;

    protected AbstractTextTrack(O options) {
        super(options);
        barePart = new DefaultBareWebTextTrackPart(options);
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
