package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class MediaPlayer extends AbstractMediaPlayer<MediaPlayer, MediaPlayerOptions> {
    public MediaPlayer() {
        this(createOptions());
    }

    public MediaPlayer(MediaPlayerOptions options) {
        super(options);
    }

    public static MediaPlayerOptions createOptions() {
        return new MediaPlayerOptions();
    }

    public static MediaPlayer create(MediaPlayerOptions options) {
        return new MediaPlayer(options);
    }

    public static MediaPlayer create(WebBackendParentComponentOptions options) {
        return create(new MediaPlayerOptions(options));
    }

    public static MediaPlayer create() {
        return new MediaPlayer();
    }

    @Override
    protected MediaPlayer self() {
        return this;
    }
}
