package com.documentmanagement;

import com.documentmanagement.documents.*;
import com.documentmanagement.factories.*;

/**
 * Test class demonstrating the Factory Method Pattern implementation
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("Factory Method Pattern Demo");
        System.out.println("Document Management System");
        System.out.println("=================================\n");
        
        // Test 1: Direct factory usage
        testDirectFactoryUsage();
        
        // Test 2: Document Management System usage
        testDocumentManagementSystem();
        
        // Test 3: Demonstrate polymorphism
        testPolymorphism();
        
        // Test 4: Error handling
        testErrorHandling();
    }
    
    private static void testDirectFactoryUsage() {
        System.out.println("### Test 1: Direct Factory Usage ###\n");
        
        // Create different types of factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        
        // Create documents using factories
        Document wordDoc = wordFactory.createDocument("BusinessReport");
        Document pdfDoc = pdfFactory.createDocument("UserManual");
        Document excelDoc = excelFactory.createDocument("SalesData");
        
        // Test document operations
        System.out.println("\n--- Testing Word Document ---");
        wordDoc.create();
        wordDoc.open();
        if (wordDoc instanceof WordDocument) {
            ((WordDocument) wordDoc).addTable();
            ((WordDocument) wordDoc).insertImage();
        }
        wordDoc.save();
        wordDoc.close();
        
        System.out.println("\n--- Testing PDF Document ---");
        pdfDoc.create();
        pdfDoc.open();
        if (pdfDoc instanceof PdfDocument) {
            ((PdfDocument) pdfDoc).addWatermark();
            ((PdfDocument) pdfDoc).setPassword();
        }
        pdfDoc.save();
        pdfDoc.close();
        
        System.out.println("\n--- Testing Excel Document ---");
        excelDoc.create();
        excelDoc.open();
        if (excelDoc instanceof ExcelDocument) {
            ((ExcelDocument) excelDoc).addChart();
            ((ExcelDocument) excelDoc).createPivotTable();
        }
        excelDoc.save();
        excelDoc.close();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    private static void testDocumentManagementSystem() {
        System.out.println("### Test 2: Document Management System ###\n");
        
        DocumentManagementSystem dms = new DocumentManagementSystem();
        
        // List supported types
        dms.listSupportedTypes();
        System.out.println();
        
        // Create documents through the management system
        Document report = dms.createDocument("WORD", "QuarterlyReport");
        Document manual = dms.createDocument("PDF", "InstallationGuide");
        Document spreadsheet = dms.createDocument("EXCEL", "BudgetAnalysis");
        
        System.out.println("Created documents:");
        System.out.println("- " + report);
        System.out.println("- " + manual);
        System.out.println("- " + spreadsheet);
        
        // Process documents with content
        dms.processDocument("WORD", "MeetingNotes", "Today's meeting agenda...");
        dms.processDocument("PDF", "ProjectSpec", "Project specifications and requirements...");
        dms.processDocument("EXCEL", "Inventory", "Product inventory data...");
        
        System.out.println("=".repeat(50) + "\n");
    }
    
    private static void testPolymorphism() {
        System.out.println("### Test 3: Polymorphism Demonstration ###\n");
        
        // Array of different factory types
        DocumentFactory[] factories = {
            new WordDocumentFactory(),
            new PdfDocumentFactory(),
            new ExcelDocumentFactory()
        };
        
        String[] documentNames = {"ProjectPlan", "UserGuide", "DataAnalysis"};
        
        // Create documents using polymorphism
        for (int i = 0; i < factories.length; i++) {
            Document doc = factories[i].createDocument(documentNames[i]);
            System.out.println("Created: " + doc);
            
            // Demonstrate common interface
            doc.create();
            doc.setContent("Sample content for " + doc.getName());
            doc.save();
            System.out.println("Content: " + doc.getContent());
            doc.close();
            System.out.println();
        }
        
        System.out.println("=".repeat(50) + "\n");
    }
    
    private static void testErrorHandling() {
        System.out.println("### Test 4: Error Handling ###\n");
        
        DocumentManagementSystem dms = new DocumentManagementSystem();
        
        try {
            Document unsupportedDoc = dms.createDocument("POWERPOINT", "Presentation");
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
        
        try {
            // Try to process an unsupported document type
            dms.processDocument("UNSUPPORTED", "TestDoc", "Test content");
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
        
        System.out.println("\nError handling test completed.");
        System.out.println("=".repeat(50));
    }
}