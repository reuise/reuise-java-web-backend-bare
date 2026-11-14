package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
public class VideoPlayerOptions extends AbstractVideoPlayerOptions<VideoPlayerOptions> {
    public VideoPlayerOptions() {
    }

    public VideoPlayerOptions(WebBackendMediaPlayerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected VideoPlayerOptions self() {
        return this;
    }
}
