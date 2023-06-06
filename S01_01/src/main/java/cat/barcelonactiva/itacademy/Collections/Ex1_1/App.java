package cat.barcelonactiva.itacademy.Collections.Ex1_1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost".
        List<Month> months = new ArrayList<>();
        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));

        // Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.
        months.add(7, new Month("Agost"));
        System.out.println(months);

        // Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.
        Set<Month> monthsSet = new HashSet<>(months);
        monthsSet.add(new Month("Agost"));
        monthsSet.add(new Month("Agost"));
        monthsSet.add(new Month("Agost"));
        System.out.println(monthsSet.size() == months.size() ? "Es comprova que el set no admet duplicats." : "KO");

        // Recorre la llista amb un for i amb un iterador.
        System.out.println("---------------");
        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("---------------");
        for(int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }

        System.out.println("---------------");
        Iterator<Month> monthsSetIt = monthsSet.iterator();
        while (monthsSetIt.hasNext()) {
            System.out.println(monthsSetIt.next());
        }

    }
}
