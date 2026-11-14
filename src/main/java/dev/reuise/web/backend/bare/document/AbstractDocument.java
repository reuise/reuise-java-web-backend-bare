package dev.reuise.web.backend.bare.document;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.document.DefaultWebBackendDocument;
import dev.reuise.web.core.bare.document.BareWebDocument;
import dev.reuise.web.core.bare.document.BareWebDocumentPart;
import dev.reuise.web.core.bare.document.DefaultBareWebDocumentPart;
import dev.reuise.webstyles.StyleBuilder;
import java.util.Collection;
public abstract class AbstractDocument<S extends AbstractDocument<S, O>, O extends AbstractDocumentOptions<?>> extends DefaultWebBackendDocument<S, O> implements WebBackendComponentPart , BareWebDocument {
    protected final BareWebDocumentPart barePart;

    protected AbstractDocument(O options) {
        super(options);
        barePart = new DefaultBareWebDocumentPart(options);
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
