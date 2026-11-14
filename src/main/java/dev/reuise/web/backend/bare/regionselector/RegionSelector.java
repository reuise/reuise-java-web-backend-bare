package dev.reuise.web.backend.bare.regionselector;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
public class RegionSelector extends AbstractRegionSelector<RegionSelector, RegionSelectorOptions> {
    public RegionSelector() {
        this(createOptions());
    }

    public RegionSelector(RegionSelectorOptions options) {
        super(options);
    }

    public static RegionSelectorOptions createOptions() {
        return new RegionSelectorOptions();
    }

    public static RegionSelector create(RegionSelectorOptions options) {
        return new RegionSelector(options);
    }

    public static RegionSelector create(WebBackendSelectMenuOptions options) {
        return create(new RegionSelectorOptions(options));
    }

    public static RegionSelector create() {
        return new RegionSelector();
    }

    @Override
    protected RegionSelector self() {
        return this;
    }
}
