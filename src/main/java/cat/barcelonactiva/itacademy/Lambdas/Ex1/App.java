package cat.barcelonactiva.itacademy.Lambdas.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Ex1: A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.
        List<String> sl = new ArrayList<>();
        sl.add("The Fat cat sat on a big mat.");
        sl.add("Red gem held by elf.");
        sl.add("Big wig with pig skin.");
        sl.add("Got lost on long road.");
        sl.add("Just us, trust us.");
        sl.add("Shy guy buys dry rye.");

        System.out.println("------------------------");
        sl.stream().filter(s -> s.contains("o")).forEach(System.out::println);


        // Ex2: Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
        System.out.println("------------------------");
        sl.stream().filter(s -> s.contains("o")).filter(s -> Arrays.stream(s.split("\\s+")).count() > 5).forEach(System.out::println);

        // Ex3: Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.
        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println("------------------------");
        months.forEach(s -> System.out.println(s));

        // Ex4: Fer la mateixa impressió del punt anterior, però mitjançant method reference.
        System.out.println("------------------------");
        months.forEach(System.out::println);

        // Ex5: Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.
        System.out.println("------------------------");
        PiValue pi = () -> 3.1415;
        System.out.println("Pi és igual a " + pi.getPiValue());

        // Ex6: Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.
        System.out.println("------------------------");
        List<Object> os = new ArrayList<>();
        os.add("The");
        os.add("Brown");
        os.add(2);
        os.add("Fox");
        os.add(3);
        os.add("Jumped");
        os.add("Over");
        os.add(1);

        os.stream()
                .filter(o -> o instanceof String)
                .sorted(Comparator.comparingInt(s -> ((String) s).length()))
                .forEach(System.out::println);

        // Ex7: Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
        System.out.println("------------------------");
        os.stream()
                .filter(o -> o instanceof String)
                .sorted(Comparator.comparingInt(s -> ((String) s).length()).reversed())
                .forEach(System.out::println);

        // Ex8: Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.
        System.out.println("------------------------");
        StringReverser reverser = (str) -> {
            return new StringBuilder(str).reverse().toString();
        };

        String str = "The functional interfaces reverses correctly";
        System.out.printf(str + ": " + reverser.reverse(str));


    }

}
