package cat.barcelonactiva.itacademy.HerenciaPolimorfisme.Ex1_2;

public class Cotxe {
    static final String marca = "Ford";

    static String model;
    final int potencia = 110;  //cv

    static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    void accelerar() {
        System.out.println("El vehicle està accelerant");
    }
}
