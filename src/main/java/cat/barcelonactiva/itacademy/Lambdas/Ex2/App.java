package cat.barcelonactiva.itacademy.Lambdas.Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        // Ex1: Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista de totes les cadenes que comencen amb la lletra 'A' (majúscula) i  tenen exactament 3 lletres. Imprimeix el resultat.
        List<String> names = new ArrayList<>();
        names.add("Joan");
        names.add("Ada");
        names.add("Maria");
        names.add("Alex");
        names.add("Alí");
        names.add("Alba");

        for (String s : ex1(names))
            System.out.println(s);

        // Ex2: Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers. Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” si el nombre és imparell. Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.
        List<Integer> integers = new ArrayList<>(Arrays.asList(3, 55, 44));

        System.out.println(ex2(integers));

        // Ex3: Crea una Functional Interface que contingui un mètode anomenat operacio(). Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que es pugui transformar l’operació amb una suma, una resta, una multiplicació i una divisió.

        IOperacio suma = (float... values) -> {
            float result = 0;
            for (float v : values)
                result += v;
            return result;
        };

        IOperacio resta = (float... values) -> {
            float result = 0;
            for (float v : values)
                result -= v;
            return result;
        };

        IOperacio multiplicacio = (float... values) -> {
            float result = 0;
            for (float v : values)
                result *= v;
            return result;
        };

        IOperacio divisio = (float... values) -> {
            float result = 0;
            for (float v : values)
                result /= v;
            return result;
        };

        // Ex 4: Crea una llista que contingui algunes cadenes de text i nombres.


        List<Object> mixedList = new ArrayList<>();
        mixedList.add("Joan");
        mixedList.add("Ada");
        mixedList.add("Eduard");
        mixedList.add("Pere");
        mixedList.add("Elvira");
        mixedList.add("Maria");
        mixedList.add("Alex");
        mixedList.add("Alí");
        mixedList.add("Alba");
        mixedList.add(1);
        mixedList.add(2);
        mixedList.add(3);
        mixedList.add("4");
        mixedList.add("5");

        // Ordena-les per:
        // Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)

        List<Object> mlRes1 = mixedList.stream()
                .sorted(Comparator.comparingInt(obj ->
                        obj instanceof String ?
                                ((String) obj).charAt(0)
                                : (int) obj
                )).toList();

        System.out.println(mlRes1);

        // Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
        List<Object> mlRes2 = mixedList.stream()
                .sorted(Comparator.comparingInt(obj ->
                        obj instanceof String str ?
                                str.contains("e") || str.contains("E") ? -1 : str.charAt(0)
                                : (int) obj
                )).toList();

        System.out.println(mlRes2);


        // Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
        List<Object> mlRes3 = mixedList.stream()
                .map(obj ->
                        obj instanceof String ?
                                ((String) obj).replaceAll("[Aa]", "4")
                                : obj)
                .toList();

        System.out.println(mlRes3);


        // Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).
        List<Object> mlRes4 = mixedList.stream()
                .filter(obj -> {
                    try {
                        Double.parseDouble(obj.toString());
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .toList();

        System.out.println(mlRes4);
    }


    public static List<String> ex1(List<String> list) {
        return list.stream()
                .filter(s -> s.charAt(0) == 'A' && s.length() == 3)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static String ex2(List<Integer> list) {
        return list.stream()
                .map(n -> n % 2 == 0 ? "e" + n : "o" + n)
                .collect(Collectors.joining(", "));
    }
}
