package dev.reuise.web.backend.bare.filepicker;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.filepicker.DefaultWebBackendFilePicker;
import dev.reuise.web.core.bare.filepicker.BareWebFilePicker;
import dev.reuise.web.core.bare.filepicker.BareWebFilePickerPart;
import dev.reuise.web.core.bare.filepicker.DefaultBareWebFilePickerPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractFilePicker<S extends AbstractFilePicker<S, O>, O extends AbstractFilePickerOptions<?>> extends DefaultWebBackendFilePicker<S, O> implements WebBackendComponentPart , BareWebFilePicker {
    protected final BareWebFilePickerPart barePart;

    protected AbstractFilePicker(O options) {
        super(options);
        barePart = new DefaultBareWebFilePickerPart(options);
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
