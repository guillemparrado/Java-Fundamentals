package cat.barcelonactiva.itacademy.Utils.Ex1_5;

import java.io.Serializable;

public class Person implements Serializable {

    public enum HairColor {
        BLACK, BLOND, BROWN, RED, WHITE
    }
    private final String name;
    private final int age;
    private final int height;
    private final HairColor hairColor;

    public Person(String name, int age, int height, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hairColor=" + hairColor +
                '}';
    }
}
