package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class RotatingText extends AbstractRotatingText<RotatingText, RotatingTextOptions> {
    public RotatingText() {
        this(createOptions());
    }

    public RotatingText(RotatingTextOptions options) {
        super(options);
    }

    public static RotatingTextOptions createOptions() {
        return new RotatingTextOptions();
    }

    public static RotatingText create(RotatingTextOptions options) {
        return new RotatingText(options);
    }

    public static RotatingText create(WebBackendBaseComponentOptions options) {
        return create(new RotatingTextOptions(options));
    }

    public static RotatingText create() {
        return new RotatingText();
    }

    @Override
    protected RotatingText self() {
        return this;
    }
}
