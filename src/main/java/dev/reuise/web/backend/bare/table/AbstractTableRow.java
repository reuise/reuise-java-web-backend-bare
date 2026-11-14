package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableRow;
import dev.reuise.web.core.bare.table.BareWebTableRow;
import dev.reuise.web.core.bare.table.BareWebTableRowPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableRowPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableRow<S extends AbstractTableRow<S, O>, O extends AbstractTableRowOptions<?>> extends DefaultWebBackendTableRow<S, O> implements BareWebTableRow , WebBackendComponentPart {
    protected final BareWebTableRowPart barePart;

    protected AbstractTableRow(O options) {
        super(options);
        barePart = new DefaultBareWebTableRowPart(options);
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
