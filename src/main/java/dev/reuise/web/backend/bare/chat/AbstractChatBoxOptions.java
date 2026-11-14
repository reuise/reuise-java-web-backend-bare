package dev.reuise.web.backend.bare.chat;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.chat.AbstractWebBackendChatBoxOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.core.bare.chat.BareWebChatBoxPartOptions;
import dev.reuise.web.core.bare.chat.DefaultBareWebChatBoxOptions;
public abstract class AbstractChatBoxOptions<S extends AbstractChatBoxOptions<S>> extends AbstractWebBackendChatBoxOptions<S> implements BareWebChatBoxPartOptions {
    protected final BareWebChatBoxPartOptions barePart;

    protected AbstractChatBoxOptions() {
        this(null);
    }

    protected AbstractChatBoxOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebChatBoxOptions();
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
