package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TextTrackOptions extends AbstractTextTrackOptions<TextTrackOptions> {
    public TextTrackOptions() {
    }

    public TextTrackOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected TextTrackOptions self() {
        return this;
    }
}
