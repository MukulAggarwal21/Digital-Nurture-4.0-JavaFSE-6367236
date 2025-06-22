package com.documentmanagement.documents;


public class PdfDocument extends Document {
    
    public PdfDocument(String name) {
        super(name);
    }
    
    @Override
    public void create() {
        System.out.println("Creating PDF document: " + name + ".pdf");
        System.out.println("Setting up PDF metadata...");
    }
    
    @Override
    public void open() {
        System.out.println("Opening PDF document: " + name + ".pdf");
        System.out.println("Loading PDF viewer...");
    }
    
    @Override
    public void save() {
        System.out.println("Saving PDF document: " + name + ".pdf");
        System.out.println("Optimizing PDF size...");
    }
    
    @Override
    public void close() {
        System.out.println("Closing PDF document: " + name + ".pdf");
    }
    
    @Override
    public String getFileExtension() {
        return ".pdf";
    }
    
    // PDF-specific methods
    public void addWatermark() {
        System.out.println("Adding watermark to PDF document");
    }
    
    public void setPassword() {
        System.out.println("Setting password protection for PDF document");
    }
}
