package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableHeader;
import dev.reuise.web.core.bare.table.BareWebTableHeader;
import dev.reuise.web.core.bare.table.BareWebTableHeaderPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableHeaderPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableHeader<S extends AbstractTableHeader<S, O>, O extends AbstractTableHeaderOptions<?>> extends DefaultWebBackendTableHeader<S, O> implements WebBackendComponentPart , BareWebTableHeader {
    protected final BareWebTableHeaderPart barePart;

    protected AbstractTableHeader(O options) {
        super(options);
        barePart = new DefaultBareWebTableHeaderPart(options);
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
