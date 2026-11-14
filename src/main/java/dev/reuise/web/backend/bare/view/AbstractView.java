package dev.reuise.web.backend.bare.view;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.view.DefaultWebBackendView;
import dev.reuise.web.core.bare.view.BareWebView;
import dev.reuise.web.core.bare.view.BareWebViewPart;
import dev.reuise.web.core.bare.view.DefaultBareWebViewPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractView<S extends AbstractView<S, O>, O extends AbstractViewOptions<?>> extends DefaultWebBackendView<S, O> implements BareWebView , WebBackendComponentPart {
    protected final BareWebViewPart barePart;

    protected AbstractView(O options) {
        super(options);
        barePart = new DefaultBareWebViewPart(options);
        if (options == null)
            return;

        // addPart(ComponentPart.Type.DESIGN, barePart)
        initialize(self(), options);
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}
