package cat.barcelonactiva.itacademy.Annotations.Ex1_1;

public class TreballadorPresencial extends Treballador {
    public static int benzina = 300;

    public TreballadorPresencial(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public int calcularSou(int numHores) {
        return preuHora * numHores + benzina;
    }
}
