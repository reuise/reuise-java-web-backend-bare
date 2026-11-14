package dev.reuise.web.backend.bare.avatar;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class Avatar extends AbstractAvatar<Avatar, AvatarOptions> {
    public Avatar() {
        this(createOptions());
    }

    public Avatar(AvatarOptions options) {
        super(options);
    }

    public static AvatarOptions createOptions() {
        return new AvatarOptions();
    }

    public static Avatar create(AvatarOptions options) {
        return new Avatar(options);
    }

    public static Avatar create(WebBackendParentComponentOptions options) {
        return create(new AvatarOptions(options));
    }

    public static Avatar create() {
        return new Avatar();
    }

    @Override
    protected Avatar self() {
        return this;
    }
}
