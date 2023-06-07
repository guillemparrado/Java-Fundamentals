package cat.barcelonactiva.itacademy.Annotations.Ex1_2;

public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        String numHores = "200";
        int preuHora = 20;

        Treballador t = new Treballador("Alex", "Sánchez", preuHora);
        TreballadorOnline to = new TreballadorOnline("Maria", "López", preuHora);
        TreballadorPresencial tp = new TreballadorPresencial("Juan", "Martínez", preuHora);

        t.printSou(numHores);
        to.printSou(numHores);
        tp.printSou(numHores);
    }
}