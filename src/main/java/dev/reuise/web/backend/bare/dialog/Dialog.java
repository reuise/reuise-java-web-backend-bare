package dev.reuise.web.backend.bare.dialog;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Dialog extends AbstractDialog<Dialog, DialogOptions> {
    public Dialog() {
        this(createOptions());
    }

    public Dialog(DialogOptions options) {
        super(options);
    }

    public static DialogOptions createOptions() {
        return new DialogOptions();
    }

    public static Dialog create(DialogOptions options) {
        return new Dialog(options);
    }

    public static Dialog create(WebBackendParentComponentOptions options) {
        return create(new DialogOptions(options));
    }

    public static Dialog create() {
        return new Dialog();
    }

    @Override
    protected Dialog self() {
        return this;
    }
}
