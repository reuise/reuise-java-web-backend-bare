package dev.reuise.web.backend.bare.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.chip.AbstractWebBackendChipGroupOptions;
import dev.reuise.web.backend.layout.WebBackendFieldSetOptions;
import dev.reuise.web.core.bare.chip.BareWebChipGroupPartOptions;
import dev.reuise.web.core.bare.chip.DefaultBareWebChipGroupOptions;
public abstract class AbstractChipGroupOptions<S extends AbstractChipGroupOptions<S>> extends AbstractWebBackendChipGroupOptions<S> implements BareWebChipGroupPartOptions {
    protected final BareWebChipGroupPartOptions barePart;

    protected AbstractChipGroupOptions() {
        this(null);
    }

    protected AbstractChipGroupOptions(WebBackendFieldSetOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebChipGroupOptions();
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
