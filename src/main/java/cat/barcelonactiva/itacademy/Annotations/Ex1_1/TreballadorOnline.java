package cat.barcelonactiva.itacademy.Annotations.Ex1_1;

public class TreballadorOnline extends Treballador {
    public static final int tarifaPlana = 45;

    public TreballadorOnline(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public int calcularSou(int numHores) {
        return preuHora * numHores + tarifaPlana;
    }


}
