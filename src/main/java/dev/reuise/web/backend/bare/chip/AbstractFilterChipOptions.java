package dev.reuise.web.backend.bare.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.chip.AbstractWebBackendFilterChipOptions;
import dev.reuise.web.backend.chip.WebBackendChipOptions;
import dev.reuise.web.core.bare.chip.BareWebFilterChipPartOptions;
import dev.reuise.web.core.bare.chip.DefaultBareWebFilterChipOptions;
public abstract class AbstractFilterChipOptions<S extends AbstractFilterChipOptions<S>> extends AbstractWebBackendFilterChipOptions<S> implements BareWebFilterChipPartOptions {
    protected final BareWebFilterChipPartOptions barePart;

    protected AbstractFilterChipOptions() {
        this(null);
    }

    protected AbstractFilterChipOptions(WebBackendChipOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebFilterChipOptions();
        ((BaseComponentOptions) (getBaseComponentPart())).initialize(this);
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    public WebBackendComponentFactory getComponentFactory() {
        return DefaultComponentFactory.get();
    }
}
