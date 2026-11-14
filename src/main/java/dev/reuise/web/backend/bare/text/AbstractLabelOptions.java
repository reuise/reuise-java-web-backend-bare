package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendLabelOptions;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.bare.text.BareWebLabelPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebLabelOptions;
public abstract class AbstractLabelOptions<S extends AbstractLabelOptions<S>> extends AbstractWebBackendLabelOptions<S> implements BareWebLabelPartOptions {
    protected final BareWebLabelPartOptions barePart;

    protected AbstractLabelOptions() {
        this(null);
    }

    protected AbstractLabelOptions(WebBackendInlineTextOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebLabelOptions();
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
