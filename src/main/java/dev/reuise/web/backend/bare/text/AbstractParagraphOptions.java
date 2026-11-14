package dev.reuise.web.backend.bare.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.bare.DefaultComponentFactory;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.text.AbstractWebBackendParagraphOptions;
import dev.reuise.web.core.bare.text.BareWebParagraphPartOptions;
import dev.reuise.web.core.bare.text.DefaultBareWebParagraphOptions;
public abstract class AbstractParagraphOptions<S extends AbstractParagraphOptions<S>> extends AbstractWebBackendParagraphOptions<S> implements BareWebParagraphPartOptions {
    protected final BareWebParagraphPartOptions barePart;

    protected AbstractParagraphOptions() {
        this(null);
    }

    protected AbstractParagraphOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
        barePart = new DefaultBareWebParagraphOptions();
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
