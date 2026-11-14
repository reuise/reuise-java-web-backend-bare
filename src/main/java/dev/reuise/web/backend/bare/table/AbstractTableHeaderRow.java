package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableHeaderRow;
import dev.reuise.web.core.bare.table.BareWebTableHeaderRow;
import dev.reuise.web.core.bare.table.BareWebTableHeaderRowPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableHeaderRowPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableHeaderRow<S extends AbstractTableHeaderRow<S, O>, O extends AbstractTableHeaderRowOptions<?>> extends DefaultWebBackendTableHeaderRow<S, O> implements WebBackendComponentPart , BareWebTableHeaderRow {
    protected final BareWebTableHeaderRowPart barePart;

    protected AbstractTableHeaderRow(O options) {
        super(options);
        barePart = new DefaultBareWebTableHeaderRowPart(options);
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
