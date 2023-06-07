package cat.barcelonactiva.itacademy.Generics.Ex2_2;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", "Sánchez", 20);
        Person p2 = new Person("Maria", "López", 34);
        Person p3 = new Person("Juan", "Martínez", 26);

        GenericMethods<Person> personMethods = new GenericMethods<>();
        personMethods.printObjects("Married", p1, p3);

        GenericMethods<String> stringMethods = new GenericMethods<>();
        stringMethods.printObjects("Friends", "Carla", "Maria", "Marc");

        GenericMethods<Integer> intMethods = new GenericMethods<>();
        intMethods.printObjects("Integers", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
