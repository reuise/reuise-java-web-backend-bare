package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendTextOptions;
import dev.reuise.web.core.bare.text.BareWebTextPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebTextOptions;
public abstract class AbstractTextOptions<S extends AbstractTextOptions<S>> extends AbstractWebBackendTextOptions<S> implements BareWebTextPartOptions {
    protected final BareWebTextPartOptions barePart;

    protected AbstractTextOptions() {
        this(null);
    }

    protected AbstractTextOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTextOptions();
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
