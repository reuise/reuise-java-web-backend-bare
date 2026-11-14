package dev.reuise.web.backend.bare.filepicker;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.filepicker.AbstractWebBackendFilePickerOptions;
import dev.reuise.web.core.bare.filepicker.BareWebFilePickerPartOptions;
import dev.reuise.web.core.bare.filepicker.DefaultBareWebFilePickerOptions;
public abstract class AbstractFilePickerOptions<S extends AbstractFilePickerOptions<S>> extends AbstractWebBackendFilePickerOptions<S> implements BareWebFilePickerPartOptions {
    protected final BareWebFilePickerPartOptions barePart;

    protected AbstractFilePickerOptions() {
        this(null);
    }

    protected AbstractFilePickerOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebFilePickerOptions();
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
