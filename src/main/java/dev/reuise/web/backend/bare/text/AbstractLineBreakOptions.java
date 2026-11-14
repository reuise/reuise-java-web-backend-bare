package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendLineBreakOptions;
import dev.reuise.web.core.bare.text.BareWebLineBreakPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebLineBreakOptions;
public abstract class AbstractLineBreakOptions<S extends AbstractLineBreakOptions<S>> extends AbstractWebBackendLineBreakOptions<S> implements BareWebLineBreakPartOptions {
    protected final BareWebLineBreakPartOptions barePart;

    protected AbstractLineBreakOptions() {
        this(null);
    }

    protected AbstractLineBreakOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebLineBreakOptions();
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
