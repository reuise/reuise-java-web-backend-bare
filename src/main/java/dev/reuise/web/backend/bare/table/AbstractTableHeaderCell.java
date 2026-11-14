package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableHeaderCell;
import dev.reuise.web.core.bare.table.BareWebTableHeaderCell;
import dev.reuise.web.core.bare.table.BareWebTableHeaderCellPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableHeaderCellPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableHeaderCell<S extends AbstractTableHeaderCell<S, O>, O extends AbstractTableHeaderCellOptions<?>> extends DefaultWebBackendTableHeaderCell<S, O> implements WebBackendComponentPart , BareWebTableHeaderCell {
    protected final BareWebTableHeaderCellPart barePart;

    protected AbstractTableHeaderCell(O options) {
        super(options);
        barePart = new DefaultBareWebTableHeaderCellPart(options);
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
