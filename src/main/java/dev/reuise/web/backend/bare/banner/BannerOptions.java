package dev.reuise.web.backend.bare.banner;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class BannerOptions extends AbstractBannerOptions<BannerOptions> {
    public BannerOptions() {
    }

    public BannerOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected BannerOptions self() {
        return this;
    }
}
