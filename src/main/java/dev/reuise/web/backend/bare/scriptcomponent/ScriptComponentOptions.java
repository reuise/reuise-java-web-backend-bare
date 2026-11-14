package dev.reuise.web.backend.bare.scriptcomponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ScriptComponentOptions extends AbstractScriptComponentOptions<ScriptComponentOptions> {
    public ScriptComponentOptions() {
    }

    public ScriptComponentOptions(WebBackendParentComponentOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected ScriptComponentOptions self() {
        return this;
    }
}
