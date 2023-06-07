package cat.barcelonactiva.itacademy.Annotations.Ex1_1;

public class Treballador {
    protected String nom, cognom;
    protected int preuHora;

    public Treballador(String nom, String cognom, int preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public int calcularSou(int numHores) {
        return preuHora * numHores;
    }

    public void printSou(int numHores) {
        int sou = calcularSou(numHores);
        System.out.println("El sou del " + this.getClass().getSimpleName() + " " + nom + " " + cognom + " és " + sou + " €.");
    }
}
