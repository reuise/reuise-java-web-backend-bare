package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableBody;
import dev.reuise.web.core.bare.table.BareWebTableBody;
import dev.reuise.web.core.bare.table.BareWebTableBodyPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableBodyPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableBody<S extends AbstractTableBody<S, O>, O extends AbstractTableBodyOptions<?>> extends DefaultWebBackendTableBody<S, O> implements BareWebTableBody , WebBackendComponentPart {
    protected final BareWebTableBodyPart barePart;

    protected AbstractTableBody(O options) {
        super(options);
        barePart = new DefaultBareWebTableBodyPart(options);
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
