package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
public class RotatingTextOptions extends AbstractRotatingTextOptions<RotatingTextOptions> {
    public RotatingTextOptions() {
    }

    public RotatingTextOptions(WebBackendBaseComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected RotatingTextOptions self() {
        return this;
    }
}
