package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableCell;
import dev.reuise.web.core.bare.table.BareWebTableCell;
import dev.reuise.web.core.bare.table.BareWebTableCellPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableCellPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableCell<S extends AbstractTableCell<S, O>, O extends AbstractTableCellOptions<?>> extends DefaultWebBackendTableCell<S, O> implements BareWebTableCell , WebBackendComponentPart {
    protected final BareWebTableCellPart barePart;

    protected AbstractTableCell(O options) {
        super(options);
        barePart = new DefaultBareWebTableCellPart(options);
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
