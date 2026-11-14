package dev.reuise.web.backend.bare.avatar;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.avatar.DefaultWebBackendAvatar;
import dev.reuise.web.core.bare.avatar.BareWebAvatar;
import dev.reuise.web.core.bare.avatar.BareWebAvatarPart;
import dev.reuise.web.core.bare.avatar.DefaultBareWebAvatarPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractAvatar<S extends AbstractAvatar<S, O>, O extends AbstractAvatarOptions<?>> extends DefaultWebBackendAvatar<S, O> implements WebBackendComponentPart , BareWebAvatar {
    protected final BareWebAvatarPart barePart;

    protected AbstractAvatar(O options) {
        super(options);
        barePart = new DefaultBareWebAvatarPart(options);
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
