package cat.barcelonactiva.itacademy.Collections.Ex1_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import static java.lang.System.exit;

public class App {
    private final String resourcesFolder = "S01_01/src/main/resources/";
    private final Map<String, String> countryCity = new HashMap<>();
    private final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        loadMap();
        String userName = askUserName();
        String country, answer;
        int points = 0;

        for(int i = 0; i < 10; i++){
            country = getRandomCountry();
            answer = askAnswer(country);
            if(answer.equals(countryCity.get(country))){
                System.out.println("Correct!");
                points += 1;
            }
            else {
                System.out.println("Incorrect! The answer was: " + countryCity.get(country) + ".");
            }
        }

        System.out.println("Game over! You scored " + points + " points.");
        saveScore(userName, points);
    }

    private void saveScore(String userName, int points) {

        String filename = resourcesFolder + "classificacio.txt";
        String line = "User: " + userName + ", points: " + points + "\n";
        try {
            Files.write(Paths.get(filename), line.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error: file with scores could not be saved.");
        }
    }

    private String askAnswer(String country) {
        System.out.println("What is the capital of " + country + "?");
        return in.nextLine();
    }

    private String getRandomCountry() {
        List<String> countries = new ArrayList<>(countryCity.keySet());
        return countries.get(new Random().nextInt(countries.size()));
    }

    private String askUserName() {
        System.out.println("What is your name?");
        return in.nextLine();
    }

    private void loadMap() {
        try {
            String FILE_PATH = resourcesFolder + "countries.txt";
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH));
            for (String line : lines) {
                String[] tokens = line.split(" ");
                if (tokens.length == 2)
                    countryCity.put(tokens[0], tokens[1]);
            }
        } catch (IOException e) {
            System.out.println("File of countries and cities could not be loaded");
            exit(1);
        }
    }

}
