package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTable;
import dev.reuise.web.core.bare.table.BareWebTable;
import dev.reuise.web.core.bare.table.BareWebTablePart;
import dev.reuise.web.core.bare.table.DefaultBareWebTablePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTable<S extends AbstractTable<S, O>, O extends AbstractTableOptions<?>> extends DefaultWebBackendTable<S, O> implements BareWebTable , WebBackendComponentPart {
    protected final BareWebTablePart barePart;

    protected AbstractTable(O options) {
        super(options);
        barePart = new DefaultBareWebTablePart(options);
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
