package singletonpattern;

import singletonpattern.logger.Logger;
import singletonpattern.logger.ThreadSafeLogger;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Demo Application ===\n");
        
        demonstrateBasicLogger();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateThreadSafeLogger();
        
        System.out.println("\n=== Application completed successfully ===");
    }
    

    private static void demonstrateBasicLogger() {
        System.out.println("--- Basic Logger Demonstration ---");
        
        Logger logger = Logger.getInstance();
        
        logger.logInfo("Starting application...");
        
        simulateApplicationOperations(logger);
        
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.logInfo("Using another logger reference - same instance: " + 
                             (logger == anotherLogger));
        
        logger.logInfo("Application shutting down...");
    }
    
  
    private static void demonstrateThreadSafeLogger() {
        System.out.println("--- Thread-Safe Logger Demonstration ---");
        
        ThreadSafeLogger logger = ThreadSafeLogger.getInstance();
        
        logger.logInfo("Starting thread-safe logging demonstration...");
        
       for (int i = 1; i <= 3; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                ThreadSafeLogger threadLogger = ThreadSafeLogger.getInstance();
                threadLogger.logInfo("Thread " + threadNumber + " - Instance ID: " + 
                                   System.identityHashCode(threadLogger));
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    threadLogger.logError("Thread interrupted: " + e.getMessage());
                }
                
                threadLogger.logInfo("Thread " + threadNumber + " completed");
            }, "LoggerThread-" + i);
            
            thread.start();
        }
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            logger.logError("Main thread interrupted: " + e.getMessage());
        }
        
        logger.logInfo("Thread-safe logging demonstration completed");
    }
    
  
    private static void simulateApplicationOperations(Logger logger) {
        logger.logInfo("Initializing database connection...");
        logger.logInfo("Database connection established");
        
        logger.logInfo("Loading configuration files...");
        logger.logWarning("Configuration file 'optional.properties' not found, using defaults");
        
        logger.logInfo("Starting web server...");
        logger.logInfo("Web server started on port 8080");
        
        logger.logDebug("System memory usage: 256MB");
        logger.logDebug("Active threads: 12");
        
        // Simulate an error
        logger.logError("Failed to connect to external service - retrying...");
        logger.logInfo("Successfully connected to external service on retry");
        
        logger.logInfo("Application initialization completed");
    }
}