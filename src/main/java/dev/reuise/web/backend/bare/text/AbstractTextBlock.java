package dev.reuise.web.backend.bare.text;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.text.DefaultWebBackendTextBlock;
import dev.reuise.web.core.bare.text.BareWebTextBlock;
import dev.reuise.web.core.bare.text.BareWebTextBlockPart;
import dev.reuise.web.core.bare.text.DefaultBareWebTextBlockPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractTextBlock<S extends AbstractTextBlock<S, O>, O extends AbstractTextBlockOptions<?>> extends DefaultWebBackendTextBlock<S, O> implements WebBackendComponentPart , BareWebTextBlock {
    protected final BareWebTextBlockPart barePart;

    protected AbstractTextBlock(O options) {
        super(options);
        barePart = new DefaultBareWebTextBlockPart(options);
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
