package dev.reuise.web.backend.bare.input;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
public class SearchField extends AbstractSearchField<SearchField, SearchFieldOptions> {
    public SearchField() {
        this(createOptions());
    }

    public SearchField(SearchFieldOptions options) {
        super(options);
    }

    public static SearchFieldOptions createOptions() {
        return new SearchFieldOptions();
    }

    public static SearchField create(SearchFieldOptions options) {
        return new SearchField(options);
    }

    public static SearchField create(WebBackendTextFieldOptions options) {
        return create(new SearchFieldOptions(options));
    }

    public static SearchField create() {
        return new SearchField();
    }

    @Override
    protected SearchField self() {
        return this;
    }
}
