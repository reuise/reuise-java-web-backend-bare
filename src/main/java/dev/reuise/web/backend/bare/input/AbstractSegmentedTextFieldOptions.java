package dev.reuise.web.backend.bare.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.input.AbstractWebBackendSegmentedTextFieldOptions;
import dev.reuise.web.backend.layout.WebBackendRowLayoutOptions;
import dev.reuise.web.core.bare.input.BareWebSegmentedTextFieldPartOptions;
import dev.reuise.web.core.bare.input.DefaultBareWebSegmentedTextFieldOptions;
public abstract class AbstractSegmentedTextFieldOptions<S extends AbstractSegmentedTextFieldOptions<S>> extends AbstractWebBackendSegmentedTextFieldOptions<S> implements BareWebSegmentedTextFieldPartOptions {
    protected final BareWebSegmentedTextFieldPartOptions barePart;

    protected AbstractSegmentedTextFieldOptions() {
        this(null);
    }

    protected AbstractSegmentedTextFieldOptions(WebBackendRowLayoutOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebSegmentedTextFieldOptions();
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
