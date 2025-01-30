package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class CustomLogger {
    private static final String LOG_FILE = "logs/application.log";

    public static void log(String level, String message) {
        String timestamp = LocalDateTime.now().toString();
        String logMessage = String.format("%s [%s] %s", timestamp, level, message);

        System.out.println(logMessage);

        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(logMessage + "\n");
        } catch (IOException e) {
            System.err.println("ERROR: Unable to write to log file - " + e.getMessage());
        }
    }

    public static void info(String message) {
        log("INFO", message);
    }

    public static void error(String message) {
        log("ERROR", message);
    }

    public static void debug(String message) {
        log("DEBUG", message);
    }
}
