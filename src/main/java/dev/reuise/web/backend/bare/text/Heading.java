package dev.reuise.web.backend.bare.text;
import dev.reuise.web.backend.text.WebBackendTextOptions;
public class Heading extends AbstractHeading<Heading, HeadingOptions> {
    public Heading() {
        this(createOptions());
    }

    public Heading(HeadingOptions options) {
        super(options);
    }

    public static HeadingOptions createOptions() {
        return new HeadingOptions();
    }

    public static Heading create(HeadingOptions options) {
        return new Heading(options);
    }

    public static Heading create(WebBackendTextOptions options) {
        return create(new HeadingOptions(options));
    }

    public static Heading create() {
        return new Heading();
    }

    @Override
    protected Heading self() {
        return this;
    }
}
