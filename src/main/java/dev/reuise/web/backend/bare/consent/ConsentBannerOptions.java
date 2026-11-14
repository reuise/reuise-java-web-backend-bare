package dev.reuise.web.backend.bare.consent;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
public class ConsentBannerOptions extends AbstractConsentBannerOptions<ConsentBannerOptions> {
    public ConsentBannerOptions() {
    }

    public ConsentBannerOptions(WebBackendFlexContainerOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ConsentBannerOptions self() {
        return this;
    }
}
