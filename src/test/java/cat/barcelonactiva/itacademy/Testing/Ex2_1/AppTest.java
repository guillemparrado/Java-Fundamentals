package cat.barcelonactiva.itacademy.Testing.Ex2_1;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {
    @Test
    public void testStringLengthMatcher() {
        String str = "Mordor";
        assertThat(str, StringLengthMatcher.hasLength(8));
    }
}
