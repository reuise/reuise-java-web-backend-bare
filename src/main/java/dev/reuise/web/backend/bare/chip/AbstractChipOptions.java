package dev.reuise.web.backend.bare.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.chip.AbstractWebBackendChipOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.core.bare.chip.BareWebChipPartOptions;
import dev.reuise.web.core.bare.chip.DefaultBareWebChipOptions;
public abstract class AbstractChipOptions<S extends AbstractChipOptions<S>> extends AbstractWebBackendChipOptions<S> implements BareWebChipPartOptions {
    protected final BareWebChipPartOptions barePart;

    protected AbstractChipOptions() {
        this(null);
    }

    protected AbstractChipOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebChipOptions();
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
