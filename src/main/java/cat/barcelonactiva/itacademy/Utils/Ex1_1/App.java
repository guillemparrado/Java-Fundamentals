package cat.barcelonactiva.itacademy.Utils.Ex1_1;

import java.util.Arrays;
import java.io.File;


public class App {
    public void printSortedContent(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if(files != null)
            Arrays.stream(files).map(File::getName).sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {
        App app = new App();
        app.printSortedContent("src/main/java/cat/barcelonactiva/itacademy/");
    }


}
