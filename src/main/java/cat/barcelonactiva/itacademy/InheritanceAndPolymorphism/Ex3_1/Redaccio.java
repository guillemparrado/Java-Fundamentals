package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

import java.util.ArrayList;

public class Redaccio {
    final private ArrayList<Redactor> redactors = new ArrayList<>();

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
