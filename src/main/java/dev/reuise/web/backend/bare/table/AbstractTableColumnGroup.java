package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableColumnGroup;
import dev.reuise.web.core.bare.table.BareWebTableColumnGroup;
import dev.reuise.web.core.bare.table.BareWebTableColumnGroupPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableColumnGroupPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableColumnGroup<S extends AbstractTableColumnGroup<S, O>, O extends AbstractTableColumnGroupOptions<?>> extends DefaultWebBackendTableColumnGroup<S, O> implements BareWebTableColumnGroup , WebBackendComponentPart {
    protected final BareWebTableColumnGroupPart barePart;

    protected AbstractTableColumnGroup(O options) {
        super(options);
        barePart = new DefaultBareWebTableColumnGroupPart(options);
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
