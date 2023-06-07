package cat.barcelonactiva.itacademy.Generics.Ex1_2;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", "Sánchez", 20);
        Person p2 = new Person("Maria", "López", 34);
        Person p3 = new Person("Juan", "Martínez", 26);

        GenericMethods<Person> personMethods = new GenericMethods<>();
        personMethods.printObjects(p1, p2, p3);

        GenericMethods<String> stringMethods = new GenericMethods<>();
        stringMethods.printObjects("Alex", "Maria", "Juan");

        GenericMethods<Integer> intMethods = new GenericMethods<>();
        intMethods.printObjects(1, 2, 3);
    }
}
