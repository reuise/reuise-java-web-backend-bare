package dev.reuise.web.backend.bare.list;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.list.DefaultWebBackendBasicList;
import dev.reuise.web.core.bare.list.BareWebBasicList;
import dev.reuise.web.core.bare.list.BareWebBasicListPart;
import dev.reuise.web.core.bare.list.DefaultBareWebBasicListPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractBasicList<S extends AbstractBasicList<S, O>, O extends AbstractBasicListOptions<?>> extends DefaultWebBackendBasicList<S, O> implements BareWebBasicList , WebBackendComponentPart {
    protected final BareWebBasicListPart barePart;

    protected AbstractBasicList(O options) {
        super(options);
        barePart = new DefaultBareWebBasicListPart(options);
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
