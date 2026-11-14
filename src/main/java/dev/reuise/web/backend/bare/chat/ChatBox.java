package dev.reuise.web.backend.bare.chat;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
public class ChatBox extends AbstractChatBox<ChatBox, ChatBoxOptions> {
    public ChatBox() {
        this(createOptions());
    }

    public ChatBox(ChatBoxOptions options) {
        super(options);
    }

    public static ChatBoxOptions createOptions() {
        return new ChatBoxOptions();
    }

    public static ChatBox create(ChatBoxOptions options) {
        return new ChatBox(options);
    }

    public static ChatBox create(WebBackendContainerOptions options) {
        return create(new ChatBoxOptions(options));
    }

    public static ChatBox create() {
        return new ChatBox();
    }

    @Override
    protected ChatBox self() {
        return this;
    }
}
