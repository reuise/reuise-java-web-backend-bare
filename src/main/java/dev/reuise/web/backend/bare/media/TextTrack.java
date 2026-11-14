package dev.reuise.web.backend.bare.media;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class TextTrack extends AbstractTextTrack<TextTrack, TextTrackOptions> {
    public TextTrack() {
        this(createOptions());
    }

    public TextTrack(TextTrackOptions options) {
        super(options);
    }

    public static TextTrackOptions createOptions() {
        return new TextTrackOptions();
    }

    public static TextTrack create(TextTrackOptions options) {
        return new TextTrack(options);
    }

    public static TextTrack create(WebBackendParentComponentOptions options) {
        return create(new TextTrackOptions(options));
    }

    public static TextTrack create() {
        return new TextTrack();
    }

    @Override
    protected TextTrack self() {
        return this;
    }
}
