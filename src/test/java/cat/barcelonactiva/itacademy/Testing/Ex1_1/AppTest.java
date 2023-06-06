package cat.barcelonactiva.itacademy.Testing.Ex1_1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AppTest {

    private App app;
    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testGetMonths() {
        List<String> months = app.getMonths();
        Assert.assertNotNull(months);
        Assert.assertEquals(12, app.getMonths().size());
        Assert.assertEquals("August", months.get(7));
    }
}