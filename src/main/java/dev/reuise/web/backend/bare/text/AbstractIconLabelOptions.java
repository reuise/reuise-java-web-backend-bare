package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendIconLabelOptions;
import dev.reuise.web.core.bare.text.BareWebIconLabelPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebIconLabelOptions;
public abstract class AbstractIconLabelOptions<S extends AbstractIconLabelOptions<S>> extends AbstractWebBackendIconLabelOptions<S> implements BareWebIconLabelPartOptions {
    protected final BareWebIconLabelPartOptions barePart;

    protected AbstractIconLabelOptions() {
        this(null);
    }

    protected AbstractIconLabelOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebIconLabelOptions();
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
