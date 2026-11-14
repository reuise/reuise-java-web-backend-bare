package dev.reuise.web.backend.bare.scriptcomponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
public class ScriptComponent extends AbstractScriptComponent<ScriptComponent, ScriptComponentOptions> {
    public ScriptComponent() {
        this(createOptions());
    }

    public ScriptComponent(ScriptComponentOptions options) {
        super(options);
    }

    public static ScriptComponentOptions createOptions() {
        return new ScriptComponentOptions();
    }

    public static ScriptComponent create(ScriptComponentOptions options) {
        return new ScriptComponent(options);
    }

    public static ScriptComponent create(WebBackendParentComponentOptions options) {
        return create(new ScriptComponentOptions(options));
    }

    public static ScriptComponent create() {
        return new ScriptComponent();
    }

    @Override
    protected ScriptComponent self() {
        return this;
    }
}
