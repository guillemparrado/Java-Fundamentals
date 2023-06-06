package cat.barcelonactiva.itacademy.Testing.Ex1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void throwException() {
        App app = new App();
        assertThrows(ArrayIndexOutOfBoundsException.class, app::throwException);
    }
}