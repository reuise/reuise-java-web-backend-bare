package dev.reuise.web.backend.bare.filepicker;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class FilePickerOptions extends AbstractFilePickerOptions<FilePickerOptions> {
    public FilePickerOptions() {
    }

    public FilePickerOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected FilePickerOptions self() {
        return this;
    }
}
