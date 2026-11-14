package dev.reuise.web.backend.bare.chat;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class ChatBoxOptions extends AbstractChatBoxOptions<ChatBoxOptions> {
    public ChatBoxOptions() {
    }

    public ChatBoxOptions(WebBackendContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ChatBoxOptions self() {
        return this;
    }
}
