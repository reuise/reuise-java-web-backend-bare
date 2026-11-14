package dev.reuise.web.backend.bare.consent;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class ConsentBanner extends AbstractConsentBanner<ConsentBanner, ConsentBannerOptions> {
    public ConsentBanner() {
        this(createOptions());
    }

    public ConsentBanner(ConsentBannerOptions options) {
        super(options);
    }

    public static ConsentBannerOptions createOptions() {
        return new ConsentBannerOptions();
    }

    public static ConsentBanner create(ConsentBannerOptions options) {
        return new ConsentBanner(options);
    }

    public static ConsentBanner create(WebBackendFlexContainerOptions options) {
        return create(new ConsentBannerOptions(options));
    }

    public static ConsentBanner create() {
        return new ConsentBanner();
    }

    @Override
    protected ConsentBanner self() {
        return this;
    }
}
