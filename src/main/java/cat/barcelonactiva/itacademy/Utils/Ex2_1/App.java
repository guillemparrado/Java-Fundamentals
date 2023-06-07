package cat.barcelonactiva.itacademy.Utils.Ex2_1;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.System.exit;
import java.util.Properties;
public class App {

    private PrintWriter writer;
    public void logSortedContent(String folderPath, String logFileName) {
        try{
            FileWriter fileWriter = new FileWriter(logFileName);
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

        String configFile = "./src/main/java/cat/barcelonactiva/itacademy/Utils/Ex2_1/config.properties";
        try (InputStream input = new FileInputStream(configFile)) {
            Properties properties = new Properties();
            properties.load(input);
            App app = new App();
            app.logSortedContent(
                    properties.getProperty("inputFolder"),
                    properties.getProperty("logFileName"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
