package dev.reuise.web.backend.bare.icon;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.icon.DefaultWebBackendIcon;
import dev.reuise.web.core.bare.icon.BareWebIcon;
import dev.reuise.web.core.bare.icon.BareWebIconPart;
import dev.reuise.web.core.bare.icon.DefaultBareWebIconPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractIcon<S extends AbstractIcon<S, O>, O extends AbstractIconOptions<?>> extends DefaultWebBackendIcon<S, O> implements BareWebIcon , WebBackendComponentPart {
    protected final BareWebIconPart barePart;

    protected AbstractIcon(O options) {
        super(options);
        barePart = new DefaultBareWebIconPart(options);
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
