package dev.reuise.web.backend.bare.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.graphics.svg.DefaultWebBackendSvgImage;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgImage;
import dev.reuise.web.core.bare.graphics.svg.BareWebSvgImagePart;
import dev.reuise.web.core.bare.graphics.svg.DefaultBareWebSvgImagePart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractSvgImage<S extends AbstractSvgImage<S, O>, O extends AbstractSvgImageOptions<?>> extends DefaultWebBackendSvgImage<S, O> implements BareWebSvgImage , WebBackendComponentPart {
    protected final BareWebSvgImagePart barePart;

    protected AbstractSvgImage(O options) {
        super(options);
        barePart = new DefaultBareWebSvgImagePart(options);
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
