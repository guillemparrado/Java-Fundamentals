package cat.barcelonactiva.itacademy.Testing.Ex2_1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class StringLengthMatcher extends FeatureMatcher<String, Integer> {

    public StringLengthMatcher(Matcher<Integer> subMatcher) {
        super(subMatcher, "a string with length", "length");
    }

    @Override
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }

    public static Matcher<String> hasLength(int length) {
        Matcher<Integer> matcher = Matchers.equalTo(length);
        return new StringLengthMatcher(matcher);
    }
}
