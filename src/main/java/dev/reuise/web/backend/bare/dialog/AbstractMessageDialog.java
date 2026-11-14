package dev.reuise.web.backend.bare.dialog;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.dialog.DefaultWebBackendMessageDialog;
import dev.reuise.web.core.bare.dialog.BareWebMessageDialog;
import dev.reuise.web.core.bare.dialog.BareWebMessageDialogPart;
import dev.reuise.web.core.bare.dialog.DefaultBareWebMessageDialogPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractMessageDialog<S extends AbstractMessageDialog<S, O>, O extends AbstractMessageDialogOptions<?>> extends DefaultWebBackendMessageDialog<S, O> implements WebBackendComponentPart , BareWebMessageDialog {
    protected final BareWebMessageDialogPart barePart;

    protected AbstractMessageDialog(O options) {
        super(options);
        barePart = new DefaultBareWebMessageDialogPart(options);
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
