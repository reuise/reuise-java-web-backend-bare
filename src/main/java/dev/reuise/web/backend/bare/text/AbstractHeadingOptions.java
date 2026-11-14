package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendHeadingOptions;
import dev.reuise.web.backend.text.WebBackendTextOptions;
import dev.reuise.web.core.bare.text.BareWebHeadingPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebHeadingOptions;
public abstract class AbstractHeadingOptions<S extends AbstractHeadingOptions<S>> extends AbstractWebBackendHeadingOptions<S> implements BareWebHeadingPartOptions {
    protected final BareWebHeadingPartOptions barePart;

    protected AbstractHeadingOptions() {
        this(null);
    }

    protected AbstractHeadingOptions(WebBackendTextOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebHeadingOptions();
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
