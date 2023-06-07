package cat.barcelonactiva.itacademy.Generics.Ex1_1;

public class App {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods = new NoGenericMethods("A", "B", "C");
        System.out.println(noGenericMethods);

        // Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("C", "A", "B");
        System.out.println(noGenericMethods2);
    }
}
