package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
public class AudioPlayerOptions extends AbstractAudioPlayerOptions<AudioPlayerOptions> {
    public AudioPlayerOptions() {
    }

    public AudioPlayerOptions(WebBackendMediaPlayerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected AudioPlayerOptions self() {
        return this;
    }
}
