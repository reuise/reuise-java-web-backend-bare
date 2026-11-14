package dev.reuise.web.backend.bare.dialog;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.dialog.DefaultWebBackendDialog;
import dev.reuise.web.core.bare.dialog.BareWebDialog;
import dev.reuise.web.core.bare.dialog.BareWebDialogPart;
import dev.reuise.web.core.bare.dialog.DefaultBareWebDialogPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractDialog<S extends AbstractDialog<S, O>, O extends AbstractDialogOptions<?>> extends DefaultWebBackendDialog<S, O> implements WebBackendComponentPart , BareWebDialog {
    protected final BareWebDialogPart barePart;

    protected AbstractDialog(O options) {
        super(options);
        barePart = new DefaultBareWebDialogPart(options);
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
