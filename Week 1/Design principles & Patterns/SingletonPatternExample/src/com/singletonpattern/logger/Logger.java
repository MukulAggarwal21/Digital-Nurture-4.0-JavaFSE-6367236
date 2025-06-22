package singletonpattern.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    
  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    private static final Logger instance = new Logger();

    private Logger() {
        System.out.println("Logger instance created at: " + getCurrentTimestamp());
    }
    

    public static Logger getInstance() {
        return instance;
    }
    
   
    public void logInfo(String message) {
        System.out.println("[INFO] " + getCurrentTimestamp() + " - " + message);
    }
    
 
    public void logError(String message) {
        System.err.println("[ERROR] " + getCurrentTimestamp() + " - " + message);
    }
  
    public void logWarning(String message) {
        System.out.println("[WARNING] " + getCurrentTimestamp() + " - " + message);
    }
    
  
    public void logDebug(String message) {
        System.out.println("[DEBUG] " + getCurrentTimestamp() + " - " + message);
    }
   
    private String getCurrentTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "Logger{" +
                "instanceId=" + System.identityHashCode(this) +
                ", createdAt=" + getCurrentTimestamp() +
                '}';
    }
}