package cat.barcelonactiva.itacademy.Generics.Ex2_1;

public class GenericMethods<T> {
    public void printObjects(T o1, T o2, String relation) {
        System.out.println(o1 + " and " + o2 + " are " + relation + ".");
    }
}
