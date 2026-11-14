package dev.reuise.web.backend.bare.regionselector;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
public class RegionSelectorOptions extends AbstractRegionSelectorOptions<RegionSelectorOptions> {
    public RegionSelectorOptions() {
    }

    public RegionSelectorOptions(WebBackendSelectMenuOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected RegionSelectorOptions self() {
        return this;
    }
}
