package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendCheckboxTableCell;
import dev.reuise.web.core.bare.table.BareWebCheckboxTableCell;
import dev.reuise.web.core.bare.table.BareWebCheckboxTableCellPart;
import dev.reuise.web.core.bare.table.DefaultBareWebCheckboxTableCellPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCheckboxTableCell<S extends AbstractCheckboxTableCell<S, O>, O extends AbstractCheckboxTableCellOptions<?>> extends DefaultWebBackendCheckboxTableCell<S, O> implements WebBackendComponentPart , BareWebCheckboxTableCell {
    protected final BareWebCheckboxTableCellPart barePart;

    protected AbstractCheckboxTableCell(O options) {
        super(options);
        barePart = new DefaultBareWebCheckboxTableCellPart(options);
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
