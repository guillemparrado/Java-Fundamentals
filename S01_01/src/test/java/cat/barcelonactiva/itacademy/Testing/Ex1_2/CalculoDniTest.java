package cat.barcelonactiva.itacademy.Testing.Ex1_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculoDniTest {

    @Test
    public void calcularLetraDni() {
        assertEquals('B', CalculoDni.calcularLetraDni(123456789));
        assertEquals('E', CalculoDni.calcularLetraDni(234567891));
        assertEquals('K', CalculoDni.calcularLetraDni(345678912));
        assertEquals('S', CalculoDni.calcularLetraDni(456789123));
        assertEquals('M', CalculoDni.calcularLetraDni(567891234));
        assertEquals('R', CalculoDni.calcularLetraDni(678912345));
        assertEquals('B', CalculoDni.calcularLetraDni(789123456));
        assertEquals('T', CalculoDni.calcularLetraDni(891234567));
        assertEquals('D', CalculoDni.calcularLetraDni(912345678));
        assertEquals('H', CalculoDni.calcularLetraDni(11111111));
    }
}