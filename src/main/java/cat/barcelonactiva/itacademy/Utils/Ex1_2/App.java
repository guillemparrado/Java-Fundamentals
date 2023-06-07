package cat.barcelonactiva.itacademy.Utils.Ex1_2;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public void printSortedContent(String folderPath) {
        printSortedContent(folderPath, 0);
    }

    public void printSortedContent(String folderPath, int depth) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            Arrays.sort(files, Comparator.comparing(File::getName));
            for (File file : files) {
                System.out.println("  ".repeat(depth) + file.getName());
                if (file.isDirectory())
                    printSortedContent(file.getAbsolutePath(), depth + 1);
            }

        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.printSortedContent("./");
    }


}
