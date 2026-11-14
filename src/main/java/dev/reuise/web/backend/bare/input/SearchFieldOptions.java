package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
public class SearchFieldOptions extends AbstractSearchFieldOptions<SearchFieldOptions> {
    public SearchFieldOptions() {
    }

    public SearchFieldOptions(WebBackendTextFieldOptions baseOptions) {
        super(baseOptions);
    }

    @Override
    protected SearchFieldOptions self() {
        return this;
    }
}
