package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendCheckboxTableColumn;
import dev.reuise.web.core.bare.table.BareWebCheckboxTableColumn;
import dev.reuise.web.core.bare.table.BareWebCheckboxTableColumnPart;
import dev.reuise.web.core.bare.table.DefaultBareWebCheckboxTableColumnPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractCheckboxTableColumn<S extends AbstractCheckboxTableColumn<S, O>, O extends AbstractCheckboxTableColumnOptions<?>> extends DefaultWebBackendCheckboxTableColumn<S, O> implements BareWebCheckboxTableColumn , WebBackendComponentPart {
    protected final BareWebCheckboxTableColumnPart barePart;

    protected AbstractCheckboxTableColumn(O options) {
        super(options);
        barePart = new DefaultBareWebCheckboxTableColumnPart(options);
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
