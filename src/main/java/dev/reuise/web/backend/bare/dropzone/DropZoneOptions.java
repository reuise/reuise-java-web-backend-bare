package dev.reuise.web.backend.bare.dropzone;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class DropZoneOptions extends AbstractDropZoneOptions<DropZoneOptions> {
    public DropZoneOptions() {
    }

    public DropZoneOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected DropZoneOptions self() {
        return this;
    }
}
