package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendTextBlockOptions;
import dev.reuise.web.backend.text.WebBackendTextOptions;
import dev.reuise.web.core.bare.text.BareWebTextBlockPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebTextBlockOptions;
public abstract class AbstractTextBlockOptions<S extends AbstractTextBlockOptions<S>> extends AbstractWebBackendTextBlockOptions<S> implements BareWebTextBlockPartOptions {
    protected final BareWebTextBlockPartOptions barePart;

    protected AbstractTextBlockOptions() {
        this(null);
    }

    protected AbstractTextBlockOptions(WebBackendTextOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebTextBlockOptions();
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
