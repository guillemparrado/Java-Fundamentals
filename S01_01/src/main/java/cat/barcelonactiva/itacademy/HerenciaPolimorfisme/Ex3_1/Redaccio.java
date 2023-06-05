package cat.barcelonactiva.itacademy.HerenciaPolimorfisme.Ex3_1;

import java.util.ArrayList;

public class Redaccio {
    final private ArrayList<Redactor> redactors = new ArrayList<Redactor>();

    public ArrayList<Redactor> getRedactors() {
        return redactors;
    }

    public void addRedactor(Redactor redactor) {
        redactors.add(redactor);
    }

    public void removeRedactor(Redactor redactor) {
        redactors.remove(redactor);
    }
}
