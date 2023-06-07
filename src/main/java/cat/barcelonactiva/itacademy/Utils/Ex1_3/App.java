package cat.barcelonactiva.itacademy.Utils.Ex1_3;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.io.PrintWriter;

import static java.lang.System.exit;

public class App {

    private PrintWriter writer;
    public void logSortedContent(String folderPath) {
        try{
            FileWriter fileWriter = new FileWriter("./src/main/resources/Utils_Ex1_3_log.txt");
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

    public static void main(String[] args) {
        App app = new App();
        app.logSortedContent("./");
    }

}
