package dev.reuise.web.backend.bare.dialog;
import dev.reuise.web.backend.dialog.WebBackendDialogOptions;
public class MessageDialog extends AbstractMessageDialog<MessageDialog, MessageDialogOptions> {
    public MessageDialog() {
        this(createOptions());
    }

    public MessageDialog(MessageDialogOptions options) {
        super(options);
    }

    public static MessageDialogOptions createOptions() {
        return new MessageDialogOptions();
    }

    public static MessageDialog create(MessageDialogOptions options) {
        return new MessageDialog(options);
    }

    public static MessageDialog create(WebBackendDialogOptions options) {
        return create(new MessageDialogOptions(options));
    }

    public static MessageDialog create() {
        return new MessageDialog();
    }

    @Override
    protected MessageDialog self() {
        return this;
    }
}
