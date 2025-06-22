package singletonpattern.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThreadSafeLogger {
    
    private static volatile ThreadSafeLogger instance;
    
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
 
    private ThreadSafeLogger() {
        System.out.println("ThreadSafeLogger instance created at: " + getCurrentTimestamp());
    }
    
   
    public static ThreadSafeLogger getInstance() {
        // First check (no synchronization)
        if (instance == null) {
            // Synchronization block
            synchronized (ThreadSafeLogger.class) {
                // Second check (with synchronization)
                if (instance == null) {
                    instance = new ThreadSafeLogger();
                }
            }
        }
        return instance;
    }
    
  
    public synchronized void logInfo(String message) {
        System.out.println("[INFO] " + getCurrentTimestamp() + " - " + message);
    }
   
    public synchronized void logError(String message) {
        System.err.println("[ERROR] " + getCurrentTimestamp() + " - " + message);
    }

    public synchronized void logWarning(String message) {
        System.out.println("[WARNING] " + getCurrentTimestamp() + " - " + message);
    }
    
 
    public synchronized void logDebug(String message) {
        System.out.println("[DEBUG] " + getCurrentTimestamp() + " - " + message);
    }
    
 
    private String getCurrentTimestamp() {
        return LocalDateTime.now().format(formatter);
    }
    
    
    @Override
    public String toString() {
        return "ThreadSafeLogger{" +
                "instanceId=" + System.identityHashCode(this) +
                ", createdAt=" + getCurrentTimestamp() +
                '}';
    }
}