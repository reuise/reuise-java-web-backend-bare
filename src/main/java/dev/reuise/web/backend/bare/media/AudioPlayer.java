package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
public class AudioPlayer extends AbstractAudioPlayer<AudioPlayer, AudioPlayerOptions> {
    public AudioPlayer() {
        this(createOptions());
    }

    public AudioPlayer(AudioPlayerOptions options) {
        super(options);
    }

    public static AudioPlayerOptions createOptions() {
        return new AudioPlayerOptions();
    }

    public static AudioPlayer create(AudioPlayerOptions options) {
        return new AudioPlayer(options);
    }

    public static AudioPlayer create(WebBackendMediaPlayerOptions options) {
        return create(new AudioPlayerOptions(options));
    }

    public static AudioPlayer create() {
        return new AudioPlayer();
    }

    @Override
    protected AudioPlayer self() {
        return this;
    }
}
