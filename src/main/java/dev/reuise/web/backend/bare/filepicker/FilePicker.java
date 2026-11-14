package dev.reuise.web.backend.bare.filepicker;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class FilePicker extends AbstractFilePicker<FilePicker, FilePickerOptions> {
    public FilePicker() {
        this(createOptions());
    }

    public FilePicker(FilePickerOptions options) {
        super(options);
    }

    public static FilePickerOptions createOptions() {
        return new FilePickerOptions();
    }

    public static FilePicker create(FilePickerOptions options) {
        return new FilePicker(options);
    }

    public static FilePicker create(WebBackendBaseComponentOptions options) {
        return create(new FilePickerOptions(options));
    }

    public static FilePicker create() {
        return new FilePicker();
    }

    @Override
    protected FilePicker self() {
        return this;
    }
}
