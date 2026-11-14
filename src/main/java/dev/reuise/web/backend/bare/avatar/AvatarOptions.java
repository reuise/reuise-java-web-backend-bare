package dev.reuise.web.backend.bare.avatar;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class AvatarOptions extends AbstractAvatarOptions<AvatarOptions> {
    public AvatarOptions() {
    }

    public AvatarOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected AvatarOptions self() {
        return this;
    }
}
