package dev.reuise.web.backend.bare.input;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.DefaultWebBackendSearchField;
import dev.reuise.web.core.bare.input.BareWebSearchField;
import dev.reuise.web.core.bare.input.BareWebSearchFieldPart;
import dev.reuise.web.core.bare.input.DefaultBareWebSearchFieldPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSearchField<S extends AbstractSearchField<S, O>, O extends AbstractSearchFieldOptions<?>> extends DefaultWebBackendSearchField<S, O> implements WebBackendComponentPart , BareWebSearchField {
    protected final BareWebSearchFieldPart barePart;

    protected AbstractSearchField(O options) {
        super(options);
        barePart = new DefaultBareWebSearchFieldPart(options);
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
