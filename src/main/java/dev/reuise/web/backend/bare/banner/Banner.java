package dev.reuise.web.backend.bare.banner;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class Banner extends AbstractBanner<Banner, BannerOptions> {
    public Banner() {
        this(createOptions());
    }

    public Banner(BannerOptions options) {
        super(options);
    }

    public static BannerOptions createOptions() {
        return new BannerOptions();
    }

    public static Banner create(BannerOptions options) {
        return new Banner(options);
    }

    public static Banner create(WebBackendFlexContainerOptions options) {
        return create(new BannerOptions(options));
    }

    public static Banner create() {
        return new Banner();
    }

    @Override
    protected Banner self() {
        return this;
    }
}
