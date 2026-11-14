package dev.reuise.web.backend.bare.dialog;
import dev.reuise.web.backend.dialog.WebBackendDialogOptions;
public class MessageDialogOptions extends AbstractMessageDialogOptions<MessageDialogOptions> {
    public MessageDialogOptions() {
    }

    public MessageDialogOptions(WebBackendDialogOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MessageDialogOptions self() {
        return this;
    }
}
