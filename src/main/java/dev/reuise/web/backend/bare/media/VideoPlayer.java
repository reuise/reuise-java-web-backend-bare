package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
public class VideoPlayer extends AbstractVideoPlayer<VideoPlayer, VideoPlayerOptions> {
    public VideoPlayer() {
        this(createOptions());
    }

    public VideoPlayer(VideoPlayerOptions options) {
        super(options);
    }

    public static VideoPlayerOptions createOptions() {
        return new VideoPlayerOptions();
    }

    public static VideoPlayer create(VideoPlayerOptions options) {
        return new VideoPlayer(options);
    }

    public static VideoPlayer create(WebBackendMediaPlayerOptions options) {
        return create(new VideoPlayerOptions(options));
    }

    public static VideoPlayer create() {
        return new VideoPlayer();
    }

    @Override
    protected VideoPlayer self() {
        return this;
    }
}
