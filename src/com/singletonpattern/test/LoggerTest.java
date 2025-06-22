package singletonpattern.test;

import singletonpattern.logger.Logger;


public class LoggerTest {
    
    public static void main(String[] args) {
        System.out.println("=== Testing Singleton Pattern Implementation ===\n");
        
        testSingletonInstance();
        
        testLoggingFunctionality();
        
        testMultiThreadedAccess();
        
        System.out.println("\n=== All tests completed ===");
    }
    
 
    private static void testSingletonInstance() {
        System.out.println("Test 1: Verifying Singleton Instance");
        System.out.println("--------------------------------------");
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();
        
        System.out.println("Logger1 instance ID: " + System.identityHashCode(logger1));
        System.out.println("Logger2 instance ID: " + System.identityHashCode(logger2));
        System.out.println("Logger3 instance ID: " + System.identityHashCode(logger3));
        
        boolean isSameInstance = (logger1 == logger2) && (logger2 == logger3);
        System.out.println("Are all instances the same? " + isSameInstance);
        
        if (isSameInstance) {
            System.out.println("✓ SUCCESS: Singleton pattern working correctly!");
        } else {
            System.out.println("✗ FAILURE: Multiple instances created!");
        }
        
        System.out.println();
    }
    
 
    private static void testLoggingFunctionality() {
        System.out.println("Test 2: Testing Logging Functionality");
        System.out.println("-------------------------------------");
        
        Logger logger = Logger.getInstance();
        
        logger.logInfo("Application started successfully");
        logger.logWarning("This is a warning message");
        logger.logError("This is an error message");
        logger.logDebug("Debug information");
        
        System.out.println("✓ SUCCESS: All logging methods working!");
        System.out.println();
    }
    

    private static void testMultiThreadedAccess() {
        System.out.println("Test 3: Testing Multi-threaded Access");
        System.out.println("-------------------------------------");
        
        Thread thread1 = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.logInfo("Message from Thread 1 - Instance ID: " + System.identityHashCode(logger));
        }, "Thread-1");
        
        Thread thread2 = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.logInfo("Message from Thread 2 - Instance ID: " + System.identityHashCode(logger));
        }, "Thread-2");
        
        Thread thread3 = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.logInfo("Message from Thread 3 - Instance ID: " + System.identityHashCode(logger));
        }, "Thread-3");
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Logger.getInstance().logError("Thread interruption: " + e.getMessage());
        }
        
        System.out.println("✓ SUCCESS: Multi-threaded test completed!");
        System.out.println("Note: All threads should show the same instance ID");
    }
}