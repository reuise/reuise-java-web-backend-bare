package dev.reuise.web.backend.bare.dialog;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class DialogOptions extends AbstractDialogOptions<DialogOptions> {
    public DialogOptions() {
    }

    public DialogOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected DialogOptions self() {
        return this;
    }
}
