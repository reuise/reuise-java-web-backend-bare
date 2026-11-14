package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableColumn;
import dev.reuise.web.core.bare.table.BareWebTableColumn;
import dev.reuise.web.core.bare.table.BareWebTableColumnPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableColumnPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableColumn<S extends AbstractTableColumn<S, O>, O extends AbstractTableColumnOptions<?>> extends DefaultWebBackendTableColumn<S, O> implements WebBackendComponentPart , BareWebTableColumn {
    protected final BareWebTableColumnPart barePart;

    protected AbstractTableColumn(O options) {
        super(options);
        barePart = new DefaultBareWebTableColumnPart(options);
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
