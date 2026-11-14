package dev.reuise.web.backend.bare.image;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.image.DefaultWebBackendImage;
import dev.reuise.web.core.bare.image.BareWebImage;
import dev.reuise.web.core.bare.image.BareWebImagePart;
import dev.reuise.web.core.bare.image.DefaultBareWebImagePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractImage<S extends AbstractImage<S, O>, O extends AbstractImageOptions<?>> extends DefaultWebBackendImage<S, O> implements BareWebImage , WebBackendComponentPart {
    protected final BareWebImagePart barePart;

    protected AbstractImage(O options) {
        super(options);
        barePart = new DefaultBareWebImagePart(options);
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
