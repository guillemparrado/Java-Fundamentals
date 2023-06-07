package cat.barcelonactiva.itacademy.Utils.Ex1_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static final String fileName = "./src/main/resources/Utils_Ex1_5_team.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person alex = new Person("Alex", 20, 165, Person.HairColor.BLOND);
        Person juan = new Person("Juan", 34, 180, Person.HairColor.RED);
        Person maria = new Person("Maria", 22, 170, Person.HairColor.BROWN);
        Person pedro = new Person("Pedro", 25, 175, Person.HairColor.BLACK);

        List<Person> team = new ArrayList<>();
        team.add(alex);
        team.add(juan);
        team.add(maria);
        team.add(pedro);

        // Serialize and save
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(team);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Load and print
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<Person> team2 = (List<Person>) ois.readObject();
            for(Person person : team2)
                System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
