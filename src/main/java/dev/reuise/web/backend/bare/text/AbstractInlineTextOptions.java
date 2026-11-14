package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendInlineTextOptions;
import dev.reuise.web.backend.text.WebBackendTextOptions;
import dev.reuise.web.core.bare.text.BareWebInlineTextPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebInlineTextOptions;
public abstract class AbstractInlineTextOptions<S extends AbstractInlineTextOptions<S>> extends AbstractWebBackendInlineTextOptions<S> implements BareWebInlineTextPartOptions {
    protected final BareWebInlineTextPartOptions barePart;

    protected AbstractInlineTextOptions() {
        this(null);
    }

    protected AbstractInlineTextOptions(WebBackendTextOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebInlineTextOptions();
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
