package dev.reuise.web.backend.bare.document;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.document.DefaultWebBackendDocumentBody;
import dev.reuise.web.core.bare.document.BareWebDocumentBody;
import dev.reuise.web.core.bare.document.BareWebDocumentBodyPart;
import dev.reuise.web.core.bare.document.DefaultBareWebDocumentBodyPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractDocumentBody<S extends AbstractDocumentBody<S, O>, O extends AbstractDocumentBodyOptions<?>> extends DefaultWebBackendDocumentBody<S, O> implements WebBackendComponentPart , BareWebDocumentBody {
    protected final BareWebDocumentBodyPart barePart;

    protected AbstractDocumentBody(O options) {
        super(options);
        barePart = new DefaultBareWebDocumentBodyPart(options);
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
