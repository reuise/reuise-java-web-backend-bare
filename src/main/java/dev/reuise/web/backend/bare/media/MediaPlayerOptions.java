package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class MediaPlayerOptions extends AbstractMediaPlayerOptions<MediaPlayerOptions> {
    public MediaPlayerOptions() {
    }

    public MediaPlayerOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected MediaPlayerOptions self() {
        return this;
    }
}
