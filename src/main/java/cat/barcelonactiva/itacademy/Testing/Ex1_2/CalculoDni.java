package cat.barcelonactiva.itacademy.Testing.Ex1_2;

public class CalculoDni {
    static char calcularLetraDni(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return letras.charAt(resto);
    }
}
