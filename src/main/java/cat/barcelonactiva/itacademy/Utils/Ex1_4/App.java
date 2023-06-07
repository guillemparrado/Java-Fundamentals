package cat.barcelonactiva.itacademy.Utils.Ex1_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.System.exit;
import java.util.Scanner;

public class App {

    private PrintWriter writer;
    private final String fileName = "./src/main/resources/Utils_Ex1_4_log.txt";
    public void logSortedContent(String folderPath) {
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            writer = new PrintWriter(fileWriter);
            logSortedContent(folderPath, 0);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            exit(1);
        }
    }

    public void logSortedContent(String folderPath, int depth) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            Arrays.sort(files, Comparator.comparing(File::getName));
            for (File file : files) {
                writer.println("  ".repeat(depth) + file.getName());
                if (file.isDirectory())
                    logSortedContent(file.getAbsolutePath(), depth + 1);
            }
        }
    }

    public void printFile(String filename){
        System.out.println("Printing file: " + filename);
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: file " + filename + " not found");
        }

    }

    public static void main(String[] args) {
        App app = new App();
        app.logSortedContent("./");
        app.printFile(app.fileName);
    }

}
