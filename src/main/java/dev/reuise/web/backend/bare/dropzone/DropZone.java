package dev.reuise.web.backend.bare.dropzone;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class DropZone extends AbstractDropZone<DropZone, DropZoneOptions> {
    public DropZone() {
        this(createOptions());
    }

    public DropZone(DropZoneOptions options) {
        super(options);
    }

    public static DropZoneOptions createOptions() {
        return new DropZoneOptions();
    }

    public static DropZone create(DropZoneOptions options) {
        return new DropZone(options);
    }

    public static DropZone create(WebBackendParentComponentOptions options) {
        return create(new DropZoneOptions(options));
    }

    public static DropZone create() {
        return new DropZone();
    }

    @Override
    protected DropZone self() {
        return this;
    }
}
