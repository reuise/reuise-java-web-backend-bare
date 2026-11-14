package dev.reuise.web.backend.bare.chat;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.chat.DefaultWebBackendChatBox;
import dev.reuise.web.core.bare.chat.BareWebChatBox;
import dev.reuise.web.core.bare.chat.BareWebChatBoxPart;
import dev.reuise.web.core.bare.chat.DefaultBareWebChatBoxPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractChatBox<S extends AbstractChatBox<S, O>, O extends AbstractChatBoxOptions<?>> extends DefaultWebBackendChatBox<S, O> implements BareWebChatBox , WebBackendComponentPart {
    protected final BareWebChatBoxPart barePart;

    protected AbstractChatBox(O options) {
        super(options);
        barePart = new DefaultBareWebChatBoxPart(options);
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
