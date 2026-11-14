package dev.reuise.web.backend.bare.table;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.table.DefaultWebBackendTableFooter;
import dev.reuise.web.core.bare.table.BareWebTableFooter;
import dev.reuise.web.core.bare.table.BareWebTableFooterPart;
import dev.reuise.web.core.bare.table.DefaultBareWebTableFooterPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTableFooter<S extends AbstractTableFooter<S, O>, O extends AbstractTableFooterOptions<?>> extends DefaultWebBackendTableFooter<S, O> implements WebBackendComponentPart , BareWebTableFooter {
    protected final BareWebTableFooterPart barePart;

    protected AbstractTableFooter(O options) {
        super(options);
        barePart = new DefaultBareWebTableFooterPart(options);
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
