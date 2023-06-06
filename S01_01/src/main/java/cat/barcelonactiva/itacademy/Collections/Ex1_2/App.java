package cat.barcelonactiva.itacademy.Collections.Ex1_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Crea i emplena un List<Integer>.
        List<Integer> intList1 = new ArrayList<>();
        intList1.add(1);
        intList1.add(2);
        intList1.add(3);

        //Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers.
        //Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
        List<Integer> intList2 = new ArrayList<>();
        Iterator<Integer> iterator = intList1.iterator();
        while (iterator.hasNext()) {
            intList2.add(0, iterator.next());
        }
        System.out.println(intList2);
    }
}
