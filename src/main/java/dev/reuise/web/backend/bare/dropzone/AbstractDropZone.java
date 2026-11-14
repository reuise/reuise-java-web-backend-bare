package dev.reuise.web.backend.bare.dropzone;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.dropzone.DefaultWebBackendDropZone;
import dev.reuise.web.core.bare.dropzone.BareWebDropZone;
import dev.reuise.web.core.bare.dropzone.BareWebDropZonePart;
import dev.reuise.web.core.bare.dropzone.DefaultBareWebDropZonePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractDropZone<S extends AbstractDropZone<S, O>, O extends AbstractDropZoneOptions<?>> extends DefaultWebBackendDropZone<S, O> implements BareWebDropZone , WebBackendComponentPart {
    protected final BareWebDropZonePart barePart;

    protected AbstractDropZone(O options) {
        super(options);
        barePart = new DefaultBareWebDropZonePart(options);
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
