package cat.barcelonactiva.itacademy.Generics.Ex2_2;

public class GenericMethods<T> {
    public void printObjects(String relation, T... objs) {
        StringBuilder sb = new StringBuilder();
        sb.append(objs[0]);
        for(int i = 1; i < objs.length - 1; i++){
            sb.append(", ").append(objs[i]);
        }
        sb.append(" and ").append(objs[objs.length - 1]).append(" are ").append(relation).append(".");
        System.out.println(sb);
    }
}
